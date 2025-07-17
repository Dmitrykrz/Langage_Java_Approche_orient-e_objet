package JAVA22;

public class test_couvre {



    public static void main(String[] args) {
        Dessin d2= new Dessin(FigureUtil.genere(5));
        System.out.println("___________________DESSIN ______________________");
        System.out.println(d2.toString());
        Point p= new Point(25,25);
        Figure covering_figure=FigureUtil.getFigureEn(p, d2);
        if (covering_figure != null){
         System.out.print("point "+ p.toString()+ " is covered by "+covering_figure.toString() );
        }
        else System.out.println("nothing covers that point");


       // ___________________DESSIN ______________________
       // RECT[[19;5][29;5][19;43][29;43]]
       // CARRE[[39;85][48;85][39;94][48;94]]
       // CARRE[[35;20][54;20][35;39][54;39]]
       // CARRE[[77;82][109;82][77;114][109;114]]
       // ROND[[67;87],41]
       // point [25;25] is covered by RECT[[19;5][29;5][19;43][29;43]]


    }
}