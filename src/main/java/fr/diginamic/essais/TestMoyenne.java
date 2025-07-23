package fr.diginamic.essais;
import java.util.Random;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {
        CalculMoyenne calc = new CalculMoyenne();
        System.out.println("average (empty array): " + calc.calcul());

        calc.ajout(100.0);
        calc.ajout(200.0);

        System.out.println("average (100, 200): " + calc.calcul());

        calc.ajout(3e10);

        System.out.println("average (100, 200, 3e10): " + calc.calcul());

        CalculMoyenne calc2 = new CalculMoyenne();
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            calc2.ajout(random.nextInt(100) + 1);
        }
        System.out.println("average (1000 random between 0 and 100, should be around 50): " + calc2.calcul());
    }
}