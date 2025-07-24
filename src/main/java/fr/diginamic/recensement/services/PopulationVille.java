package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class PopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("Veuillez saisir le nom de la ville:");
        String nomVille = scanner.nextLine();
        boolean villeFound = false;
        for (int i = 0; i < (recensement.getSize() - 1); i++) {
            if (recensement.getVilleByIndex(i).getNomDeLaCommun().equalsIgnoreCase(nomVille)) {
                villeFound = true;
                System.out.println(recensement.getVilleByIndex(i).getNomDeLaCommun() + ", " + recensement.getVilleByIndex(i).getPopTotale() + " habitants.");
            }
        }
        if (!villeFound) System.out.println(nomVille + " not found");


    }

}


