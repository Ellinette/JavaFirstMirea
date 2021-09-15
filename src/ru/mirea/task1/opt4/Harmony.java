package ru.mirea.task1.opt4;

import java.lang.*;
public class Harmony {
    private float num;

    public Harmony (float a){
        num = a;
    }

    public void HarmonyOut(){
        float hnum;
        for (float i = 1.0F; i < num + 1; i++){
            hnum = 1/i;
            System.out.println(hnum);
        }
    }
}
