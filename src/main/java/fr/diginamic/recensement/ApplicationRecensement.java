package fr.diginamic.recensement;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import fr.diginamic.recensement.services.*;
public class ApplicationRecensement {

    public static void main(String[] args) {

        Recensement recensement=new Recensement();
        Scanner scanner = new Scanner(System.in);

        Map<Integer, MenuService> services = new HashMap<>();
        services.put(1, new PopulationVille());
        services.put(2, new PopulationDepartement());
        services.put(3, new PopulationRegion());
        services.put(4, new TopRegions());
        services.put(5, new TopDepartements());
        services.put(6, new TopVillesDepartement());
        services.put(7, new TopVillesRegion());
        services.put(8, new TopVillesFrance());

       while(true) {

           int choix = 0;
           System.out.println("\n\n\n\n--- Menu Recensement ---");

           System.out.println("2. Population d’un département donné");
           System.out.println("3. Population d’une région donnée");
           System.out.println("4. Afficher les 10 régions les plus peuplées");
           System.out.println("5. Afficher les 10 départements les plus peuplés");
           System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
           System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
           System.out.println("8. Afficher les 10 villes les plus peuplées de France");
           System.out.println("9. Sortir");
           System.out.println("Veuillez faire votre choix :");

           try {
               choix = Integer.parseInt(scanner.nextLine());

               if (choix >= 1 && choix <= 8) {
                   MenuService recherche = services.get(choix);
                   recherche.traiter(recensement, scanner);

               } else if (choix == 9) {
                   System.exit(0);
               } else {
                   System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 9.");
               }
           } catch (NumberFormatException e) {
               System.out.println("Entrée invalide. Veuillez saisir un chiffre.");
           }

       }




    }
}
