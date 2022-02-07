package Practica2PSP;

import java.util.*;

public class App {

    static Monitor miMonitor;
    static final int PRODUCTOR_NUM = 100;
    static final int CONSUMIDOR_NUM = 100;
    static final int VUELTAS = 100;

    public static void main(String[] args) {

        final Monitor miMonitor = new Monitor(10);
        List<Productor> miProductor = new ArrayList<>();
        List<Consumidor> miConsumidor = new ArrayList<>();

        for (int i = 0; i < CONSUMIDOR_NUM; i++) {
            miConsumidor.add(new Consumidor(i, miMonitor, VUELTAS));
        }
        for (int i = 0; i < PRODUCTOR_NUM; i++) {
            miProductor.add(new Productor(i, miMonitor, VUELTAS));
        }

        for (Consumidor c : miConsumidor) {
            c.run();
        }

        for (Productor p : miProductor) {
            p.run();
        }

        //Los .join() no funcionan, debido a que se usan en los extends Thread 
        for (Consumidor c : miConsumidor) {
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Productor p : miProductor) {
            try {
                p.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(miMonitor);
        System.out.println("Programa terminado");
    }

}
