package fr.diginamic.combat.enemies;

import java.util.Random;

public class GenerateRandomEnemy {

    public static Enemy generate() {
        Random random = new Random();
        int enemyType = random.nextInt(3);

        if (enemyType == 0) {
            return new Wolf();
        } else if (enemyType == 1) {
            return new Goblin();
        } else {
            return new Troll();
        }
    }
}
