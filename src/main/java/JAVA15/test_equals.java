package JAVA15;


public class test_equals{

public static void main(String[] args) {

    Point a=new Point(1,2);
    Point b=new Point(1,2);

    System.out.println("a==b? "+a.equals(b));

    Carre square1 = new Carre(new Point(0, 0), 5);
    Rectangle rect1 = new Rectangle(new Point(0, 0), 5, 5);
    System.out.println("square1 == rect1? "+(square1==rect1));
    System.out.println("square1 equals rect1? "+square1.equals(rect1));





}
}

