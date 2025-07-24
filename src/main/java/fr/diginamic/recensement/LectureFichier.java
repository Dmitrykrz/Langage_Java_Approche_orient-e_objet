package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public abstract class LectureFichier {
    private static final String FILE_PATH = "recensement.csv";

    public static void read(Recensement recensement) {
        //System.out.println("Loading cities from " + FILE_PATH);

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");


                if (tokens.length == 10) {
                    try {

                        // Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;

                        int codeRegion = Integer.parseInt(tokens[0].trim());
                        String nomDeLaRegion = tokens[1].trim();
                        String codeDepartement = (tokens[2].trim());
                        int codeDeLaCommun = Integer.parseInt(tokens[5].trim());
                        String nomDeLaCommun = tokens[6].trim();
                        int popTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

                        Ville ville = new Ville(
                                codeRegion,
                                nomDeLaRegion,
                                codeDepartement,
                                codeDeLaCommun,
                                nomDeLaCommun,
                                popTotale
                        );
                        recensement.addVille(ville);

                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing number in line: " + line + " - " + e.getMessage());
                    }
                } else {
                    System.err.println("Skipping malformed line (not enough columns): " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file " + FILE_PATH + ": " + e.getMessage());

        }


        //System.out.println("Total cities loaded: " + recensement.getSize());
    }
}
