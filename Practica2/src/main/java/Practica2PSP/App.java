package Practica2PSP;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) {
        BlockingQueue<Integer> cola = new ArrayBlockingQueue<>(4); 
        Productor productor = new Productor(cola);
        Consumidor cconsumidor = new Consumidor(cola);
        productor.start();
        cconsumidor.start();
    }

     

}
