package fr.diginamic.combat.enemies;

public class GoblinArcher extends Enemy {
    public GoblinArcher(){
        this.health=random.nextInt(6) +10;
        this.strength=random.nextInt(15) +5;
        this.name="Goblin Archer";
        this.lastname=getRandomLastname("goblinnames.txt");
        this.art = "  (•͡ᴗ•͡)  \n"
                 + " --|)→   \n"
                 + "  /|     \n"
                 + "  / \\    \n";
    }
}