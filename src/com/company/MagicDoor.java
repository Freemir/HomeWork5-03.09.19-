package com.company;

public class MagicDoor {
    Heroes warrior = new Heroes(250,20,1);
    Heroes magic = new Heroes(250, 20,2);
    Heroes archer = new Heroes(250,20, 3);
    Heroes shaman = new Heroes(250, 20,4);

    public Heroes[] returnHeroes (){
        Heroes[] arrHeroes = {warrior, magic, archer, shaman};
        return arrHeroes;
    }
}
