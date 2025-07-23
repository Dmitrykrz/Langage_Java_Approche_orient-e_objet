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
        // Try to load the file as a resource from the classpath, relative to the package
        try (InputStream is = getClass().getResourceAsStream(filename)) { // Removed the leading "/"
            if (is == null) {
                System.err.println("Resource not found: " + filename + ". Make sure it's in the same package as Enemy.java or in the classpath root.");
                return "Unknown"; // Fallback if resource is not found
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
            System.err.println("Error reading lastname resource " + filename + ": " + e.getMessage());
            // Fallback in case of file read error
            return "Unknown";
        }

        if (lastnames.isEmpty()) {
            System.err.println("No lastnames found in resource: " + filename);
            return "Nameless"; // Another fallback if resource is empty
        }

        return lastnames.get(random.nextInt(lastnames.size()));
    }



}
