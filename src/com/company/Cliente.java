package com.company;

import java.lang.Thread;

/**
 * Created by motta.corrado on 17/02/2016.
 */
public class Cliente extends Thread {
    private String threadID;
    private Pizzeria p;

    Cliente(String s, int prior, Pizzeria pi){
        this.threadID = s;
        this.currentThread().setPriority(prior);
        p=pi;
    }

    public void run(){
        p.ordinaPizze(currentThread().getPriority());

    }
}
