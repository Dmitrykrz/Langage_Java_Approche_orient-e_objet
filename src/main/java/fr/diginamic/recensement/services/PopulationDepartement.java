package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class PopulationDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("Veuillez saisir le code de la département:");
        String codeDep = scanner.nextLine();
        int pop = 0;
        boolean depFound = false;

        for (int i = 0; i < (recensement.getSize() - 1); i++) {
            if (recensement.getVilleByIndex(i).getCodeDepartement().equalsIgnoreCase(codeDep)) {
                depFound = true;
                pop += recensement.getVilleByIndex(i).getPopTotale();

            }
        }
        if (!depFound) System.out.println(codeDep + " not found");
        else System.out.println(pop + " personnes vivent dans le département " + codeDep);


    }


}
