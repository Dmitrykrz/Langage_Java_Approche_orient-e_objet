package fr.diginamic.combat;

import fr.diginamic.combat.player.Hero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static int show() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice == -1) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 Create Hero");
            System.out.println("2 Fight");
            System.out.println("3 Drink Potion");
            System.out.println("4 Show Score");
            System.out.println("5 Show Inventory");
            System.out.println("6 Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    choice = -1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                choice = -1;
            }
        }
        return choice;
    }

    public static int show_potions_selection(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("\n" + hero.listPotions());
        System.out.print("Choose a potion you want to drink (number 1-" + hero.PotionsInInventory.size() + ") ");

        choice = scanner.nextInt();

        if ((choice < 1) || (choice > hero.PotionsInInventory.size())) {
            choice = -1;
            System.out.println("Invalid choice. Please enter a number between 1 and " + hero.PotionsInInventory.size());
        }
        return choice;


    }
}