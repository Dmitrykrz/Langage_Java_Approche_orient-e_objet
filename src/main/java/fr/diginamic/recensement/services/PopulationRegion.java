package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class PopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("Veuillez saisir nom de la Region:");
        String regName = scanner.nextLine();
        int pop = 0;
        boolean regFound = false;

        for (int i = 0; i < (recensement.getSize() - 1); i++) {
            if (recensement.getVilleByIndex(i).getNomDeLaRegion().equalsIgnoreCase(regName)) {
                regFound = true;
                pop += recensement.getVilleByIndex(i).getPopTotale();

            }
        }
        if (!regFound) System.out.println(regName + " not found");
        else System.out.println(pop + " personnes vivent dans le département " + regName);


    }

}
