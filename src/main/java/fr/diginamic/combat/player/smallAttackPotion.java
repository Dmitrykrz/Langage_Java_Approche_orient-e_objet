package fr.diginamic.combat.player;

public class smallAttackPotion extends Potion implements DrinkablePotion{
    public static final String potionName="Weak attack potion";
    public void drink(Potion potion){

    }
    public smallAttackPotion(int numberOfPotions){
        super("Weak attack potion", "SMALL_ATTACK");
        numberOfPotionsInInventory = numberOfPotions;
    }


}
