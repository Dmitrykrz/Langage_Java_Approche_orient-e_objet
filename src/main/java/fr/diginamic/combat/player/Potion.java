package fr.diginamic.combat.player;

public abstract class Potion {
    public int numberOfPotionsInInventory;
    public String potionName;
    public String buff;


    public Potion(String name, String buff) {
        this.potionName = name;
        this.buff=buff;
    }

    public void add() {

        numberOfPotionsInInventory++;

    }

    public String drink() throws Exception {

        boolean b = this.numberOfPotionsInInventory == 0;
        if (b) throw new Exception("You don't have any");
        else numberOfPotionsInInventory--;
        System.out.println("You drink "+ potionName);
        return buff;
    }

}
