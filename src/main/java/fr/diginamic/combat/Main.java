package fr.diginamic.combat;

import fr.diginamic.combat.player.Hero;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hero player = null;
        while (true) {
            if (player != null) {

                System.out.print("\nHP "+player.getHealth()+"  ");
            }
            int menu = Menu.show();

            if (menu == 1) {
                player = new Hero();
            } else if (menu == 2) {
                if (player != null) {
                    player = Fight.startFight(player);
                } else {
                    System.out.println("Please create a hero first.");
                }
            } else if (menu == 3) {
                if (player != null) {

                    int potionSelection = Menu.show_potions_selection(player);
                    if (potionSelection > 0) {

                        player.drinkPotion(player.PotionsInInventory.get(potionSelection - 1).getClass());
                    }


                } else {
                    System.out.println("Please create a hero first");
                }
            } else if (menu == 4) {
                if (player != null) {
                    System.out.println("Your score is " + player.getScore());
                } else {
                    System.out.println("Please create a hero first");
                }
            } else if (menu == 5) {
                if (player != null) {
                    System.out.println("\n" + player.listPotions());
                } else {
                    System.out.println("Please create a hero first");
                }
            } else if (menu == 6) {
                System.exit(0);
            }


        }
    }
}
