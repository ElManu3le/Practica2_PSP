package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;
import java.util.Scanner;

public class Consumidor extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Consumidor(BlockingQueue<Integer> aQueue) {

        this.sharedQueue = aQueue;
    }

    public void run() {

        for (int i = 0; i < 100; i++) { //Asi hacemos que haya un numero determinado de consumidores y vemos que hace el programa ante no poder consumir más
            try {
                Integer item = sharedQueue.take();
                System.out.println("Se consume el producto => " + item);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }

    }

}
