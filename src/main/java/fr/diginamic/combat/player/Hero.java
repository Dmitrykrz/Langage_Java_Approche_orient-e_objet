package fr.diginamic.combat.player;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero {
    private int health;
    private int strength;
    private int score;
    public List<Potion> PotionsInInventory;

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

    public void drinkPotion(Class<? extends Potion> potionClass) {
        for (Potion potion : PotionsInInventory) {
            if (potionClass.isInstance(potion)) {
                try {
                    String buff= potion.drink();
                    System.out.println("buff=" + buff);
                    //add health and buff!!


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }



    }

}
