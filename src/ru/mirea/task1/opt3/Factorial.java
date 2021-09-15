package ru.mirea.task1.opt3;

import java.lang.*;
public class Factorial {
    private int num;
    private int res = 1;
    public Factorial(int a){
        num = a;
    }

    public void counter(){
        for(int i = 1; i < num + 1; i++){
            res = res*i;
        }
    }
    public void getAnswer(){
        System.out.println("The factorial of " + num +" is "+ res);
    }
}
