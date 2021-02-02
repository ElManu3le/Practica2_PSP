package Practica2PSP;

import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Consumidor(BlockingQueue<Integer> aQueue) {
        super("Consumidor -");
        this.sharedQueue = aQueue;
    }

    public void run() {
        try {
            while (true) {
                Integer item = sharedQueue.take();
                System.out.println(getName() + " consume el numero =>" + item);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
