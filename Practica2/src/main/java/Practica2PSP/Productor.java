package Practica2PSP;

import java.util.concurrent.BlockingQueue;

import main.java.Practica2PSP.Monitor;

import main.java.Practica2PSP.Leer;

import java.util.Scanner;

public class Productor extends Thread {

    private int productorescant;
    private Monitor monitor;

    public Productor(Monitor monitor) {
       
    }

    public void run() {

        System.out.print("¿Cuantos productores quieres?");
        productorescant = Leer.pedirEnteroValidar();

        for (int i = 1; i <= productorescant; i++) {
            int prodRamdom = (int) (Math.random() * 101);
            monitor.moarElements(prodRamdom);
            try {
                System.out.println("El productor " + i + " produce el numero => " + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
