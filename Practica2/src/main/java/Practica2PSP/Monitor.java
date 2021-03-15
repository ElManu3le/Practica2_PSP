package main.java.Practica2PSP;

import java.util.ArrayList;

public class Monitor {

    private int capacidadmaxima = 10;
    ArrayList<Integer> queueArrayList;

    public synchronized void moarElements(int listaQueue) {
        while (queueArrayList.size() == capacidadmaxima) {
            try {
                wait(100);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getLocalizedMessage());
            }

        }
        queueArrayList.add(listaQueue);
        notifyAll();

    }

    public synchronized int menorElements() {
        while (queueArrayList.size() == 0) {
            try {
                wait(100);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getLocalizedMessage());
            }

        }
        
        notifyAll();
        return queueArrayList.remove(queueArrayList.size() - 1);

    }

}
