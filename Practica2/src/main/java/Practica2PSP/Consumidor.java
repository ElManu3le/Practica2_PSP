package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;
import main.java.Practica2PSP.Leer;
import main.java.Practica2PSP.Monitor;

public class Consumidor extends Thread {

    private int id;
    private Monitor miMonitor;

    public Consumidor(int id, Monitor miMonitor) {
        this.id = id;
        this.miMonitor = miMonitor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Soy el consumidor " + id + " y voy a consumir " + miMonitor.decrementar());
        }
    }

}
