package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import Practica2PSP.Productor;
import main.java.Practica2PSP.Monitor;

import java.util.Scanner;

public class Consumidor extends Thread {

    private int idConsumidor;
    private Monitor monitor;

    public Consumidor(Monitor monitor) {
        this.monitor = monitor;

    }

    public void run() {

        System.out.print("¿Cuantos productores quieres?");
        idConsumidor = Leer.pedirEnteroValidar();
        

        for (int i = 0; i < idConsumidor; i++) {
            try {

                monitor.menorElements();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
