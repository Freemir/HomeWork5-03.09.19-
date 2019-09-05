package com.company;

public class Heroes {

    private int health;
    private int damage;
    private int superpower;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperpower() {
        return superpower;
    }

    public void setSuperpower(int superpower) {
        this.superpower = superpower;
    }

    public Heroes (int h, int d, int sp){
        health = h;
        damage = d;
        superpower = sp;
    }
}
