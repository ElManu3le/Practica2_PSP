package Practica2PSP;

import java.util.concurrent.BlockingQueue;

import main.java.Practica2PSP.Monitor;

import main.java.Practica2PSP.Leer;

public class Productor implements Runnable {

    private int id;
    private Monitor miMonitor;
    int numLoops;

    public Productor(int id, Monitor miMonitor, int numLoops) {
        this.id = id;
        this.miMonitor = miMonitor;
        this.numLoops = numLoops;
    }

    @Override
    public void run() {
        Integer data = (ThreadLocalRandom.current().nextInt(0, numLoops)) + 1;
        miMonitor.producir(data, id);
        System.out.println("Producer [" + this.id + "] >>> produces: " + data);
    }
}
