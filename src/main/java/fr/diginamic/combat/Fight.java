package fr.diginamic.combat;

import fr.diginamic.combat.enemies.*;
import fr.diginamic.combat.player.Hero;
import fr.diginamic.combat.player.bigAttackPotion;
import fr.diginamic.combat.player.healPotion;
import fr.diginamic.combat.player.smallAttackPotion;

import java.util.Random;

public class Fight {

    public static Hero startFight(Hero hero) throws InterruptedException {
        hero.printBuffs();
        Random random = new Random();
        Enemy enemy = GenerateRandomEnemy.generate();
        String enemyName=enemy.getlastname()+ " the " +enemy.getName();
        System.out.println("\n  " + enemyName+ " attack you!\n");
        System.out.println(enemy.getArt());

        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            Thread.sleep(500);
            System.out.print("Your hp " + hero.getHealth() + "       " + enemy.getName() + " hp " + enemy.getHealth() + "     ");
            int enemyPower = enemy.getStrength() + random.nextInt(10) + 1;
            int playerPower = hero.getStrength() + random.nextInt(10) + 1;
            if (hero.hasBuff("STRENGTH2")) {
                playerPower += 5;
                //System.out.println("STRENGTH2 buff active! Bonus damage applied.");
            }
            if (hero.hasBuff("STRENGTH")) {
                playerPower += 3;
                //System.out.println("STRENGTH buff active! Bonus damage applied.");
            }

            if (enemyPower == playerPower) System.out.println("no damage was done");

            else if (enemyPower < playerPower) {
                System.out.println("You inflict  " + (playerPower - enemyPower) + " damage to " + enemy.getName());
                enemy.damage(playerPower - enemyPower);
            } else if (enemyPower > playerPower) {
                System.out.println("You suffer  " + (enemyPower - playerPower) + " damage.      Ouch!");
                hero.damage(enemyPower - playerPower);
            }

        }
        System.out.print("\n");
        if (enemy.getHealth() <= 0) {
            System.out.println("You killed " + enemyName + " !");
            if (enemy instanceof Wolf) hero.addScore(1);
            if (enemy instanceof Goblin) hero.addScore(5);
            if (enemy instanceof Troll) hero.addScore(10);
            Thread.sleep(1000);
            if (random.nextBoolean()) {
                int roll = random.nextInt(4);
                switch (roll) {
                    case 0 -> {
                        hero.addPotion(healPotion.class);
                        System.out.println("You found  "+ healPotion.potionName);
                    }
                    case 1 -> {
                        hero.addPotion(smallAttackPotion.class);
                        System.out.println("You found  "+ smallAttackPotion.potionName);
                    }
                    case 2 -> {
                        hero.addPotion(bigAttackPotion.class);
                        System.out.println("You found  "+ bigAttackPotion.potionName);
                    }
                    case 3 -> {
                        hero.addScore(5);
                        System.out.println("You found extra 5 score points! ");
                    }

                }

            } else System.out.println(enemy.getName() + " did not have anything");
        }
        if (hero.getHealth() <= 0) {

            System.out.println("YOU DIED");

            System.out.println("You were Killed by "+enemyName);
            Thread.sleep(1000);
            System.out.println("score: " + hero.getScore());
            Thread.sleep(1000);
            System.exit(0);

        }

        hero.updateBuffsAfterCombat();
        return hero;


    }
}
