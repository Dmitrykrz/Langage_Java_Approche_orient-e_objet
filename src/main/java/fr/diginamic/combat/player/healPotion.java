package fr.diginamic.combat.player;

public class healPotion extends Potion {
    public static final String potionName="Healing potion";

    public healPotion(int numberOfPotions){
        super("Healing potion","HEAL");
        numberOfPotionsInInventory = numberOfPotions;
    }


}
