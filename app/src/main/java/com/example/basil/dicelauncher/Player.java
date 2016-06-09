package com.example.basil.dicelauncher;

import java.io.Serializable;

public class Player implements Serializable {

    String namePlayer;
    int[] setDadiPlayer;

    Player (String name){
        setDadiPlayer = new int[7];
        namePlayer = name;
    }

    public void setSetDadiPlayer(int[] setDadiPlayer) {
        this.setDadiPlayer = setDadiPlayer;
    }

    public int[] getSetDadiPlayer() {
        return setDadiPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }
}
