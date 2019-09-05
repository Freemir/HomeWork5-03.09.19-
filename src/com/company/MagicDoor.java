package com.company;

public class MagicDoor {
    Heroes Warrior = new Heroes(250,20,1);
    Heroes Magic = new Heroes(250, 20,2);
    Heroes Archer = new Heroes(250,20, 3);
    Heroes Shaman = new Heroes(250, 20,4);
    public Heroes[] returnHeroes (){
        Heroes[] arrHeroes = {Warrior, Magic, Archer, Shaman};
        return arrHeroes;
    }
}
