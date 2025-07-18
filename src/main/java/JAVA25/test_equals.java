package JAVA25;


public class test_equals{

public static void main(String[] args) {

    Segment se1 = new Segment(new Point(10,10), 20, true);
    Segment se2 = new Segment(new Point(10,10), 20, true);
    Segment se3 = new Segment(new Point(10,10), 25, true);
    System.out.println("se1.equals(se2) : " + se1.equals(se2));
    System.out.println("se1.equals(se3) : " + se1.equals(se3));

    String s1 = "Demain";
    String s2 = "Demain";
//        String s2 = new String("Demain");
    String s3 = s1;
    String s4 = "Demain";
    s4 += " toto";
    System.out.println("s1.equals(s2) : " + s1.equals(s2));
    System.out.println("s1 == s2 : " + (s1 == s2));
    System.out.println("s1.equals(s3) : " + s1.equals(s3));
    System.out.println("s1 == s3 : " + (s1 == s3));




}
}

