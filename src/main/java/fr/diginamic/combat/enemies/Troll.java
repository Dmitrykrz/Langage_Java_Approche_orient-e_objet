package fr.diginamic.combat.enemies;

public class Troll extends Enemy {
    public Troll(){
        this.health=random.nextInt(11) +20;
        this.strength=random.nextInt(6) +10;
        this.name="Troll";
        this.art= "  (ò_ó)  \n"
                + "  /|_|\\  \n"
                + "   / \\   \n";
    }
}
