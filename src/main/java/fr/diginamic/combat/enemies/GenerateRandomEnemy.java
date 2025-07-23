package fr.diginamic.combat.enemies;

import java.util.Random;

public class GenerateRandomEnemy {

    public static Enemy generate() {
        Random random = new Random();
        int enemyType = random.nextInt(10);

        if (enemyType == 0) {
            return new Goblin();
        } else if (enemyType == 1) {
            return new GoblinArcher();
        } else if (enemyType == 2) {
            return new GoblinChief();
        } else if (enemyType == 3) {
            return new GoblinWizard();
        } else if (enemyType == 4) {
            return new Troll();
        } else if (enemyType == 5) {
            return new TrollBrute();
        } else if (enemyType == 6) {
            return new TrollShaman();
        } else if (enemyType == 7) {
            return new Goblin();

        } else {
            return new Wolf();
        }
    }
}
