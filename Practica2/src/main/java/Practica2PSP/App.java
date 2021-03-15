package Practica2PSP;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import main.java.Practica2PSP.Monitor;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Productor p = new Productor(monitor);
        p.start();

    }

}
