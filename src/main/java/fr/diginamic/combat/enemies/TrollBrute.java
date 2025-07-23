package fr.diginamic.combat.enemies;

public class TrollBrute extends Enemy {
    public TrollBrute(){
        this.health=random.nextInt(11) +40;
        this.strength=random.nextInt(6) +15;
        this.name="Troll Brute";
        this.lastname=getRandomLastname("trollnames.txt");
        this.art = "  (ಠ_ಠ)  \n"
                + "  /|||\\  \n"
                + "  /   \\  \n";
    }
}
