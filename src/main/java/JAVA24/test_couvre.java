package JAVA24;


public class test_couvre {



    public static void main(String[] args) {
        Dessin d2= new Dessin(FigureUtil.genere(5));
        System.out.println("___________________DESSIN ______________________");
        System.out.println(d2.toString());

        Point p= new Point(25,25);
        Figure covering_figure=FigureUtil.getFigureEn(p, d2);
        if (covering_figure != null){
         System.out.println("point "+ p.toString()+ " is covered by "+covering_figure.toString() );
        }
        else System.out.println("nothing covers the  point " + p.toString());

        System.out.println("________________________________________________");

       // ___________________DESSIN ______________________
       // RECT[[19;5][29;5][19;43][29;43]]
       // CARRE[[39;85][48;85][39;94][48;94]]
       // CARRE[[35;20][54;20][35;39][54;39]]
       // CARRE[[77;82][109;82][77;114][109;114]]
       // ROND[[67;87],41]
       // point [25;25] is covered by RECT[[19;5][29;5][19;43][29;43]]





        // unit test 1
        Point p2= new Point(13,13);
        Dessin dessin_with_1_rect= new Dessin();
        dessin_with_1_rect.add(new Carre(new Point(10,10),10));
        covering_figure=FigureUtil.getFigureEn(p2, dessin_with_1_rect);
        if (covering_figure != null){
            System.out.print("point "+ p2.toString()+ " is covered by "+dessin_with_1_rect.toString() );
        }
        else System.out.print("point "+ p2.toString()+ " is NOT covered by "+dessin_with_1_rect.toString() );



        Point p3= new Point(21,21);

        covering_figure=FigureUtil.getFigureEn(p3, dessin_with_1_rect);
        if (covering_figure != null){
            System.out.print("point "+ p3.toString()+ " is covered by "+dessin_with_1_rect.toString() );
        }
        else System.out.print("point "+ p3.toString()+ " is NOT covered by "+dessin_with_1_rect.toString() );





        // unit test 2
        Point p4= new Point(13,13);
        Dessin dessin_with_1_rond= new Dessin();
        dessin_with_1_rond.add(new Round(new Point(10,10),6));
        covering_figure=FigureUtil.getFigureEn(p4, dessin_with_1_rond);
        if (covering_figure != null){
            System.out.print("point "+ p4.toString()+ " is covered by "+dessin_with_1_rond.toString() );
        }
        else System.out.print("point "+ p4.toString()+ " is NOT covered by "+dessin_with_1_rond.toString() );

        Point p5= new Point(4,4);

        covering_figure=FigureUtil.getFigureEn(p5, dessin_with_1_rond);
        if (covering_figure != null){
            System.out.print("point "+ p5.toString()+ "is covered by "+dessin_with_1_rond.toString() );
        }
        else System.out.print("point "+ p5.toString()+ " is NOT covered by "+dessin_with_1_rond.toString() );






    }
}