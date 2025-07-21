package JAVA31;
  ///
  ///
  ///
  ///     Test
  ///   Write to file
  ///    Read from file
  ///    Parse file
  ///
  ///
  ///

public class test_save_to_file {
    public static void main(String[] args) throws DessinHorsLimiteException {

        Dessin d= new Dessin();
        for (int i = 0; i < 4; i++) {
            //d.add(getRandomFigure.generate()); // my old random figure generator
            d.add(FigureUtil.getRandomFigure()); // new generator I took from Christophe
        }


       // --------------  Write-----------------------------------------------------------------------------
        FigureUtil.sauvegarde(d,"Fig.txt");
        System.out.println("-------------------String from file-----------------------------");
        // ------------- Read------------------------------------------------------------------------------
        String drawing_from_file=FigureUtil.charge("Fig.txt");
        System.out.println(drawing_from_file);


        Dessin dessin_reconstructed= FigureUtil.parseFile(drawing_from_file);

        System.out.println("----------- Reconstructed dessin from string--------------------");
        System.out.println(dessin_reconstructed);


    }
}
