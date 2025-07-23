package fr.diginamic.combat.enemies;

public class Goblin extends Enemy {
    public Goblin(){
        this.health=random.nextInt(6) +10;
        this.strength=random.nextInt(6) +5;
        this.name="Goblin";
        this.lastname=getRandomLastname("goblinnames.txt");
        this.art= "  (¬‿¬)  \n"
                + " <-|_|-> \n"
                + "   / \\   \n";
    }
}
