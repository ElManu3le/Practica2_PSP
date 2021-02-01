package Practica2PSP;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQ = new ArrayBlockingQueue<>(10);
        Productor p = new Productor(sharedQ);
        Consumidor c = new Consumidor(sharedQ);
        p.start();
        c.start();
    }

}
