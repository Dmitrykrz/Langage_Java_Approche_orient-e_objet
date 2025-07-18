package JAVA24;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DessinToBMP {

    private static final int IMAGE_WIDTH = 100;
    private static final int IMAGE_HEIGHT = 100;

    /**
     * Creates a BMP file representing the given Dessin object.
     * Figures are drawn based on their type and properties.
     * The coordinate system is adjusted so that the origin [0;0] of the figures
     * corresponds to the bottom-left of the image, and y-coordinates increase upwards.
     *
     * @param dessin The Dessin object to render.
     * @param filename The name of the BMP file to create (e.g., "my_drawing.bmp").
     */
    public static void createBMP(Dessin dessin, String filename) {
        BufferedImage image = null;
        Graphics2D g2d = null;

        try {
            // Create a new BufferedImage with RGB color model
            image = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB);
            // Get the Graphics2D object, which allows us to draw on the image
            g2d = image.createGraphics();

            // 1. Fill the background with white
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT);

            // Iterate through each figure in the dessin
            for (Figure f : dessin.getFigures()) {
                // Set a color based on the figure type
                switch (f.getType()) {
                    case "POINT":
                        g2d.setColor(Color.RED);
                        break;
                    case "RECT":
                        g2d.setColor(Color.BLUE);
                        break;
                    case "CARRE":
                        g2d.setColor(Color.GREEN);
                        break;
                    case "ROND":
                        g2d.setColor(Color.MAGENTA);
                        break;
                    case "SEGMENT":
                        g2d.setColor(Color.BLACK);
                        break;
                    default:
                        g2d.setColor(Color.GRAY); // Fallback color
                }

                // Draw the figure based on its type
                if (f instanceof Point) {
                    Point p = (Point) f;
                    // Adjust Y coordinate: Image (0,0) is top-left, Figure (0,0) is often bottom-left.
                    // We want figure Y to map to image Y such that higher figure Y is higher on the image.
                    // For a point, draw a small filled square for visibility.
                    int drawX = p.getX();
                    int drawY = IMAGE_HEIGHT - 1 - p.getY(); // Invert Y for drawing
                    // Ensure coordinates are within bounds before drawing
                    if (drawX >= 0 && drawX < IMAGE_WIDTH && drawY >= 0 && drawY < IMAGE_HEIGHT) {
                        g2d.fillRect(drawX, drawY, 2, 2); // Draw a 2x2 pixel square
                    }
                } else if (f instanceof Rectangle) {
                    Rectangle r = (Rectangle) f;
                    // For Rectangle, draw from top-left corner
                    int x = r.getPointBasGauche().getX();
                    int y = IMAGE_HEIGHT - 1 - (r.getPointBasGauche().getY() + r.hauteur); // Invert Y: top-left Y
                    int width = r.largeur;
                    int height = r.hauteur;
                    // fillRect handles clipping, so explicit bounds check for drawing start is less critical but good for debugging
                    g2d.fillRect(x, y, width, height); // Draw filled rectangle
                } else if (f instanceof Round) {
                    Round round = (Round) f;
                    // For Round, draw from top-left of bounding box
                    // Ensure centre point exists before trying to access it
                    if (round.getPoints() != null && !round.getPoints().isEmpty()) {
                        Point centerPoint = round.getPoints().iterator().next();
                        int x = centerPoint.getX() - round.radius; // Centre X - radius
                        int y = IMAGE_HEIGHT - 1 - (centerPoint.getY() + round.radius); // Centre Y + radius (top of circle)
                        int diameter = round.radius * 2;
                        g2d.fillOval(x, y, diameter, diameter); // Draw filled circle
                    }
                } else if (f instanceof Segment) {
                    Segment s = (Segment) f;
                    // For Segment, draw a line between its start and end points
                    Point p1 = null;
                    Point p2 = null;
                    // Assuming getPoints returns exactly two points for a Segment
                    if (s.getPoints() != null && s.getPoints().size() == 2) {
                        java.util.Iterator<Point> it = s.getPoints().iterator();
                        p1 = it.next();
                        p2 = it.next();
                    }

                    if (p1 != null && p2 != null) {
                        int x1 = p1.getX();
                        int y1 = IMAGE_HEIGHT - 1 - p1.getY(); // Invert Y
                        int x2 = p2.getX();
                        int y2 = IMAGE_HEIGHT - 1 - p2.getY(); // Invert Y
                        g2d.drawLine(x1, y1, x2, y2);
                    }
                }
                // Carre is a subclass of Rectangle, so it will be handled by the Rectangle drawing logic.
            }

            // Dispose the Graphics2D object to release system resources
            if (g2d != null) {
                g2d.dispose();
            }

            // 3. Save the image as a BMP file
            File outputFile = new File(filename);
            ImageIO.write(image, "BMP", outputFile);
            System.out.println("BMP file created successfully: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error saving BMP file: " + e.getMessage());
            e.printStackTrace(); // Print full stack trace for detailed error information
            System.err.println("Attempted to save file at: " + new File(filename).getAbsolutePath());
        } catch (Exception e) {
            // Catch any other unexpected runtime exceptions during drawing
            System.err.println("An unexpected error occurred during BMP creation or drawing: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure Graphics2D resources are always disposed
            if (g2d != null) {
                g2d.dispose();
            }
        }
    }
}