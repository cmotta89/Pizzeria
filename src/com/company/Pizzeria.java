package com.company;

/**
 * Created by motta.corrado on 17/02/2016.
 */

public class Pizzeria {
    private int numPizze;
    private boolean pizzaiolo_disponibile = false;
    private int fine = 0;
    public Pizzeria(){

    }

    public synchronized ordinaPizze(int num) {
        this.numPizze = num;
        while (pizzaiolo_disponibile == false){
            try{
                wait();
            } catch (InterruptedException e);
            pizzaiolo_disponibile = false;
        }
    }

    public synchronized void serviCliente(){
        while (fine < 12){
            while (pizzaiolo_disponibile == true){
                try {
                    wait();
                } catch (InterruptedException e);
                pizzaiolo_disponibile = true;
                for(int i=0; i<numPizze; i++){
                    try{
                        sleep((long)10);
                    }
                }
            }
        }
    }
}