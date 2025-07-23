package fr.diginamic.combat.enemies;

import java.util.Random;

public abstract class Enemy {
    Random random = new Random();
    int strength;
    int health;
    String art;
    String name= "N/A";
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getArt(){
        return this.art;
    }
    public void damage(int damage){
        this.health-=damage;
    }



}
