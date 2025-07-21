package JAVA30;

public class test_dessin {


    public static void main(String[] args) {

        // Empty dessin created with a loop and then filled
        Dessin d= new Dessin();
        for (int i = 0; i < 5; i++) {
            d.add(getRandomFigure.generate());
        }
        // Second dessin created with constructor that takes the genere method that sends collection
        Dessin d2= new Dessin(FigureUtil.genere(5));

        System.out.println("___________________DESSIN 1______________________");
        System.out.println(d.toString());
        System.out.println("___________________DESSIN 2______________________");
        System.out.println(d2.toString());


    }
}
