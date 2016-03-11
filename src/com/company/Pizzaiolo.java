package com.company;

import java.lang.Thread;

/**
 * Created by motta.corrado on 17/02/2016.
 */
public class Pizzaiolo extends Thread{
    private Pizzeria p;
    Pizzaiolo(){

    }

    public void run(){
        p.serviCliente();
    }
}
