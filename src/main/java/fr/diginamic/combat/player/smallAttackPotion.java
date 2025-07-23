package fr.diginamic.combat.player;

public class smallAttackPotion extends Potion {
    public static final String potionName="Weak attack potion";

    public smallAttackPotion(int numberOfPotions){
        super("Weak attack potion", "SMALL_ATTACK");
        numberOfPotionsInInventory = numberOfPotions;
    }


}
