package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int debilityType;

    public int getHealth(int i) {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage(int i) {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDebilityType(int i) {
        debilityType = generateRandomDebility();
        return debilityType;
    }

    public void setDebilityType(int debilityType) {
        this.debilityType = debilityType;
    }
    public int generateRandomDebility(){
        Random r = new Random();
        int debility = r.nextInt(4) + 1;
        return debility;
    }

}
