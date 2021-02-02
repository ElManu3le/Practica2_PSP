package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;

public class Consumidor extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Consumidor(BlockingQueue<Integer> aQueue) {

        this.sharedQueue = aQueue;
    }

    public void run() {
        for (int i = 1; i <= 80; i++) {
            try {
                Integer item = sharedQueue.take();
                System.out.println("Se consume el producto numero => " + item);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

       /* while (true) {
            
        }*/
        

    }

}
