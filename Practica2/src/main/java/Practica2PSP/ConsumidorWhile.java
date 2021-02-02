package main.java.Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;
import java.util.Scanner;

public class ConsumidorWhile extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public ConsumidorWhile(BlockingQueue<Integer> aQueue) {

        this.sharedQueue = aQueue;
    }

    public void run() {

        while (true) { // De esta manera, hasta que la cola no quede vacia los consumidores no pararan
                       // de consumir productos
            try {
                Integer item = sharedQueue.take();
                System.out.println("Se consume el producto => " + item);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
