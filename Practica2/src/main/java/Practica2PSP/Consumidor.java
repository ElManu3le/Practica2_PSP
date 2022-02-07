package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;
import main.java.Practica2PSP.Leer;
import main.java.Practica2PSP.Monitor;

public class Consumidor implements Runnable {

    int numLoops;
    private int id;
    private Monitor miMonitor;

    

    public Consumidor(int numLoops, int id, Monitor miMonitor) {
        this.numLoops = numLoops;
        this.id = id;
        this.miMonitor = miMonitor;
    }



    @Override
    public void run() {
        int data = miMonitor.consumir(id);
        System.out.println("Consumidor [" + this.id + "] consume ==> " + data);
    }

}
