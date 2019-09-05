package com.company;

public class Main {

    public static void main(String[] args) {
        Boss VelzevulTheDemonLord = new Boss();
        VelzevulTheDemonLord.getHealth(700);
        VelzevulTheDemonLord.getDamage(50);
        VelzevulTheDemonLord.getDebilityType(0);
        MagicDoor mg = new MagicDoor();
        System.out.println(mg.returnHeroes());
    }
}
