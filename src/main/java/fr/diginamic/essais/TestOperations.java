package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        Operations calculator = new Operations();

        try {
            System.out.println("5+3= " + calculator.calcul(5.0, 3.0, '+'));
            System.out.println("100-1= " + calculator.calcul(100.0, 1.0, '-'));
            System.out.println("10*10= " + calculator.calcul(10.0, 10.0, '*'));
            System.out.println("(1e12/1e6=): " + calculator.calcul(1e12, 1e6, '/'));
            System.out.println("5/0: " + calculator.calcul(5.0, 0.0, '/'));
            System.out.print("7 w 2 = "+calculator.calcul(7.0, 2.0, 'w'));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
