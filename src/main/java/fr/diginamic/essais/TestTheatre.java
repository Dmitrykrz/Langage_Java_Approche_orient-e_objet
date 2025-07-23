package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {


        try {
            Theatre theatre1 = new Theatre("London Opera", 100);
            theatre1.inscrire(50, 10.0);
            System.out.println("Theater "+ theatre1.getName()+" has " +theatre1.getTotalClients() +" cliens. Revenue= "+theatre1.getTotalRevenue());

        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }


        try {
            Theatre theatre1 = new Theatre("Very good theatre", 100);
            theatre1.inscrire(110, 10.0);
            System.out.println("Theater "+ theatre1.getName()+"has " +theatre1.getTotalClients() +" cliens. Revenue= "+theatre1.getTotalRevenue());

        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }


    }
}