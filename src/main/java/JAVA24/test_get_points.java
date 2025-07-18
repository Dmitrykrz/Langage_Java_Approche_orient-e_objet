package JAVA24;

public class test_get_points {
    public static void main(String[] args) {

        Figure[] random_figures_array = new Figure[]{
                getrandomfigure.generate(),
                getrandomfigure.generate(),
                getrandomfigure.generate(),
                getrandomfigure.generate()
        };


        Point[] points_from_random_figures_array = FigureUtil.getPoints(random_figures_array).toArray(new Point[0]);
        System.out.println("total points from random_figures_array " + points_from_random_figures_array.length);

    }
}
