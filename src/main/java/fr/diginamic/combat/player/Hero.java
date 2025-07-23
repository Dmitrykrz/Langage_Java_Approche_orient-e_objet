package fr.diginamic.combat.player;


import java.util.*;

public class Hero {
    private int health;
    private int strength;
    private int score;
    public List<Potion> PotionsInInventory;
    private Map<String, Integer> buffs = new HashMap<>();

    Random random = new Random();
    public Hero()

    {
      this.strength=random.nextInt(7) +12;
      this.health=random.nextInt(31) +20;
      this.score=0;
      this.PotionsInInventory = new ArrayList<>();
      this.PotionsInInventory.add(new bigAttackPotion(1));
      this.PotionsInInventory.add(new smallAttackPotion(1));
      this.PotionsInInventory.add(new healPotion(1));
      System.out.println("Hero created!");
    }

    public int getHealth(){
        return this.health;
    }

    public int getScore(){
        return this.score;
    }

    public int getStrength(){
        return this.strength;
    }
     public void addScore(int score){
         this.score+=score;
     }

    public void damage(int damage){
        this.health-=damage;
    }



    public void addPotion(Class<? extends Potion> potionClass) {
        for (Potion potion : PotionsInInventory) {
            if (potionClass.isInstance(potion)) {
                potion.add();
                return;
            }
        }

    }

    public String listPotions() {
        StringBuilder sb = new StringBuilder("Potions in inventory:\n");
        int i=1;
        for (Potion potion : PotionsInInventory) {
            String className = potion.getClass().getSimpleName();
            int count = potion.numberOfPotionsInInventory;
            sb.append(i).append(":     ").append(potion.potionName).append(" (").append(count).append(")").append("\n");
            i++;
        }

        return sb.toString();
    }
    public void addBuff(String name, int duration) {
        buffs.put(name, duration);
    }

    public void drinkPotion(Class<? extends Potion> potionClass) {
        for (Potion potion : PotionsInInventory) {
            if (potionClass.isInstance(potion)) {
                try {
                    String buff= potion.drink();

                    switch (buff) {
                        case "HEAL" -> {
                            this.health += 10;
                            System.out.println("Current HP is " + this.health);

                        }
                        case "BIGATTACK" -> {
                            addBuff("STRENGTH2", 2);
                            System.out.println("Big attack buff applied (2 turns)");
                        }
                        case "SMALL_ATTACK" -> {
                            addBuff("STRENGTH", 1);
                            System.out.println("Small attack buff applied (1 turn)");
                        }
                        default -> System.out.println("No buff applied.");
                    }


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }



    }

    public void updateBuffsAfterCombat() {
        Map<String, Integer> updatedBuffs = new HashMap<>();

        for (Map.Entry<String, Integer> entry : buffs.entrySet()) {
            int duration = entry.getValue();
            if (duration > 1) {
                updatedBuffs.put(entry.getKey(), duration - 1);
            }

        }

        buffs = updatedBuffs;
    }

    public void printBuffs() {
        if (!buffs.isEmpty()) {
            System.out.println("Active buffs:");
            for (Map.Entry<String, Integer> entry : buffs.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " turn(s) remaining");
            }
        }


    }

    public boolean hasBuff(String name) {
        return buffs.containsKey(name);
    }


}
