package com.company;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random gen_rand = new Random();
        Pizzeria piz = new Pizzeria();
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        Cliente buyer[12];

        pizzaiolo.start();
        for (int i = 0; i < 12; i++) {
            buyer[i] = new Cliente("Cliente" + i, (gen_rand.nextInt(8)+1), piz);
            buyer[i].start();
        }
    }
}
