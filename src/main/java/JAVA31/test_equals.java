package JAVA31;


import JAVA30.Couleur;
import JAVA30.Point;
import JAVA30.Segment;

public class test_equals{

public static void main(String[] args) {

    Segment se1 = new Segment(new Point(10,10), 20, true, Couleur.Bleu);
    Segment se2 = new Segment(new Point(10,10), 20, true);


    System.out.println("se1 = " + se1);
    System.out.println("se2 = " + se2);
    System.out.println("se1.equals(se2) : " + se1.equals(se2));








}
}

