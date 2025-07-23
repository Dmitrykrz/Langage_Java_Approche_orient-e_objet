package fr.diginamic.combat.player;

public class healPotion extends Potion implements DrinkablePotion{
    public static final String potionName="Healing potion";
    public void drink(Potion potion){

    }
    public healPotion(int numberOfPotions){
        super("Healing potion","HEAL");
        numberOfPotionsInInventory = numberOfPotions;
    }


}
