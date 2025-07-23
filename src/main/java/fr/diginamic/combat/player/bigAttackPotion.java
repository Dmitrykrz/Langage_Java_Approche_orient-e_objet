package fr.diginamic.combat.player;

public class bigAttackPotion extends Potion  {
    public static final String potionName = "Powerful attack potion";



    public bigAttackPotion(int numberOfPotions){
        super("Powerful attack potion", "BIGATTACK");
        numberOfPotionsInInventory = numberOfPotions;
    }




}
