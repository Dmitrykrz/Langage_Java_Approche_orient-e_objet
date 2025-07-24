package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopVillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> villes = new HashMap<>();

        System.out.println("Veuillez saisir nom de la region:");
        String regionName = scanner.nextLine();


        for (int i = 0; i < (recensement.getSize() - 1); i++) {

            Ville ville = recensement.getVilleByIndex(i);
            String region = ville.getNomDeLaRegion();
            if (region.equalsIgnoreCase(regionName)) {

                villes.put(ville.getNomDeLaCommun(), ville.getPopTotale());

            }

        }


        System.out.println("\nTop 10 des plus grandes villes du region " + regionName);
        villes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue() + " habitants")
                );


    }

}
