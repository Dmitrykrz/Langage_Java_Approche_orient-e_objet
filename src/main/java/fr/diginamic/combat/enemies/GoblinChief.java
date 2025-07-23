package fr.diginamic.combat.enemies;


public class GoblinChief extends Enemy {
    public GoblinChief(){
        this.health=random.nextInt(6) +20;
        this.strength=random.nextInt(6) +5;
        this.name="Goblin Chief";
        this.lastname=getRandomLastname("goblinnames.txt");
        this.art = "  (ಠ益ಠ)  \n"
                 + " <(|||)> \n"
                 + "  /|||\\  \n"
                 + "  /   \\  \n";
    }
}