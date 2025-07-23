package fr.diginamic.combat.enemies;


public class GoblinWizard extends Enemy {
    public GoblinWizard(){
        this.health=random.nextInt(6) +10;
        this.strength=random.nextInt(6) +5;
        this.name="Goblin Wizard";
        this.lastname=getRandomLastname("goblinnames.txt");
        this.art = "   /‾‾\\   \n"
                 + "  (◕ᗜ◕)  \n"
                 + " <-|-|>⚚ \n"
                 + "   / \\   \n";
    }
}