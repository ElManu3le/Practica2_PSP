package Practica2PSP;

import java.util.concurrent.BlockingQueue;

public class Productor extends Thread {

    private BlockingQueue<Integer> sharedQueue;//BloquingQueue tiene 4 metodos para el funcionamiento de la cola

    public Productor(BlockingQueue<Integer> aQueue) { //Contructor de la clase Productor que incializa el objeto y establece los valores 
        
        this.sharedQueue = aQueue;
    }

    public void run() {
        for (int i = 1; i <= 60; i++) {
            try {
                System.out.println("El productor " + i + " produce el numero => " + i);
                sharedQueue.put(i);//El put introduce el nuevo hilo a la espera de que la cola tenga espacio para poder introducirlo 
                //Ademas es un metodo que pertenece a BlockingQueue 

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
