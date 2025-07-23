package fr.diginamic.combat.enemies;

public class TrollShaman extends Enemy {
    public TrollShaman(){
        this.health=random.nextInt(11) +20;
        this.strength=random.nextInt(9) +10;
        this.name="Troll Shaman";
        this.lastname=getRandomLastname("trollnames.txt");
        this.art = "  (⟃_⟄)  \n"
                 + "  /*|*\\  \n"
                 + "   / \\   \n";
    }
}
