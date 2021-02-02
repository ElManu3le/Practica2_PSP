package Practica2PSP;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import main.java.Practica2PSP.ConsumidorWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BlockingQueue<Integer> cola = new ArrayBlockingQueue<>(4);
        Productor productor = new Productor(cola);
        ConsumidorWhile consumidor = new ConsumidorWhile(cola);

        productor.start();
        consumidor.start();

    }

    // En caso de que el consumidor sea menor que el productor, el programa se para
    // esperando a que se introduzcan elementos en la cola.
    // En caso de que el productor sea menor que el consumidor, los consumidores
    // solo consumiran hasta la cantidad de elementos "producidos".

}
