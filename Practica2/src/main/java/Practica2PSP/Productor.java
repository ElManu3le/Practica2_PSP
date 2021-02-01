package Practica2PSP;

import java.util.concurrent.BlockingQueue;

public class Productor extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Productor(BlockingQueue<Integer> aQueue) {
        super("Productor");
        this.sharedQueue = aQueue;
    }

    public void run() { // no synchronization needed
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(getName() + " produce " + i);
                sharedQueue.put(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
