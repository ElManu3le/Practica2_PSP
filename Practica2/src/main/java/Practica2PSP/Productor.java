package Practica2PSP;

import java.util.concurrent.BlockingQueue;

import main.java.Practica2PSP.Monitor;

import main.java.Practica2PSP.Leer;

public class Productor extends Thread {

    private int id;
    private Monitor miMonitor;

    public Productor(int id, Monitor miMonitor) {
        this.id = id;
        this.miMonitor = miMonitor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            miMonitor.incrementar(numeroAleatorio);
            System.out.println("Soy el productor " + id + " y produzco " + numeroAleatorio);
        }
    }
}
