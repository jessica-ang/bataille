package com.adrar;

import java.util.Random;
public class Playeur {
    private String mName;
    private int[] mCardsDeck = new int[13];

    //fonction de jouer au joueur
    public void play ()
    {
        System.out.println((mName + " dit: c'est à mon tour de jouer !"));
    }
    //fonction de tirer une carte dans le paquet
    public int drawCard(){
        Random lRand =new Random();
        int lCarteTirer = lRand.nextInt(mCardsDeck.length);
        return mCardsDeck[lCarteTirer];
    }
    // fonction initialiser les cartes
    public void initCards(){
        for (int i=0; i<mCardsDeck.length;i++)
        {
            mCardsDeck[i] = i+1;
        }
    }

    // getter mName
    public String getName(){
        return mName;
    }
    //setter mName
    public void setName(String pName){
        mName = pName;
    }

    //getter mCardsDeck
    public int[] getCardsDeck(){
        return mCardsDeck;
    }

}