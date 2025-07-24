package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopVillesFrance extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> villes = new HashMap<>();


        for (int i = 0; i < (recensement.getSize() - 1); i++) {

            Ville ville = recensement.getVilleByIndex(i);

            villes.put(ville.getNomDeLaCommun(), ville.getPopTotale());


        }


        System.out.println("\nTop 10 des plus grandes villes de France ");
        villes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue() + " habitants")
                );


    }


}
