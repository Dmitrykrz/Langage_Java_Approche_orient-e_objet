package fr.diginamic.combat.player;

public class bigAttackPotion extends Potion implements DrinkablePotion {
    public static final String potionName = "Powerful attack potion";

    public void drink(Potion potion) {

    }

    public bigAttackPotion(int numberOfPotions){
        super("Powerful attack potion", "BIGATTACK");
        numberOfPotionsInInventory = numberOfPotions;
    }




}
