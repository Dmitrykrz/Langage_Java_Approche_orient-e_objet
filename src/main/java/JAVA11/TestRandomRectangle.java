package JAVA11;

public class TestRandomRectangle {
    public static void main(String[] args) {
        Rectangle rect = FigureUtil.getRandomRectangle();
        rect.affiche();
    }
}