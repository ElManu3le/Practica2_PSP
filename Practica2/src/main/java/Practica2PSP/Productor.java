package Practica2PSP;

import java.util.concurrent.BlockingQueue;
import java.util.Scanner;

public class Productor extends Thread {

    private int productorescant;

    private BlockingQueue<Integer> sharedQueue = null;// BloquingQueue tiene 4 metodos para el funcionamiento de la cola

    public Productor(BlockingQueue<Integer> aQueue) { // Contructor de la clase Productor que incializa el objeto y
                                                      // establece los valores

        this.sharedQueue = aQueue;
    }

    public void run() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos productores quieres?");
        productorescant = teclado.nextInt();

        for (int i = 1; i <= productorescant; i++) {
            try {
                System.out.println("El productor " + i + " produce el numero => " + i);
                sharedQueue.put(i);// El put introduce el nuevo hilo a la espera de que la cola tenga espacio para
                                   // poder introducirlo
                // Ademas es un metodo que pertenece a BlockingQueue

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
