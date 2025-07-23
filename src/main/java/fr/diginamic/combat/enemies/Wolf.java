package fr.diginamic.combat.enemies;

public class Wolf extends Enemy {



    public Wolf() {
        this.health = random.nextInt(6) + 5;
        this.strength = random.nextInt(6) + 3;
        this.name = "Wolf";
        this.lastname=getRandomLastname("wolfnames.txt");
        this.art= "   /\\_/\\  \n"
                + "  ( o.o ) \n"
                + "   > ^ <  \n";
    }
}


