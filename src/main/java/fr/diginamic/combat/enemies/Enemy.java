package fr.diginamic.combat.enemies;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Enemy {
    Random random = new Random();
    int strength;
    int health;
    String art;
    String name;
    String lastname;
    public String getName(){
        return this.name;
    }

    public String getlastname(){
        return this.lastname;
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



    protected String getRandomLastname(String filename) {
        List<String> lastnames = new ArrayList<>();

        try (InputStream is = getClass().getResourceAsStream(filename)) {
            if (is == null) {
                System.err.println("Resource not found: " + filename);
                return "Unknown";
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        lastnames.add(line.trim());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading lastname " + filename + ": " + e.getMessage());

            return "Unknown";
        }

        if (lastnames.isEmpty()) {
            System.err.println("No lastnames found in resource: " + filename);
            return "Unknown";
        }

        return lastnames.get(random.nextInt(lastnames.size()));
    }



}
