package com.example.basil.dicelauncher;

import java.util.Random;

/**
 * Created by basil on 07/06/2016.
 */
public class Dice {

    int facce;
    int risultato;

    Dice(int nFacce){
        facce = nFacce;
    }

    public int rollable (){

        Random r = new Random();
        risultato = r.nextInt(facce)+1;

        return risultato;
    }
}
