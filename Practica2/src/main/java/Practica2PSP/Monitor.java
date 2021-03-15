package main.java.Practica2PSP;

import java.util.ArrayList;

public class Monitor {

    private ArrayList<Integer> listaDeElementos;
	private int maxElementos;

	public Monitor() {
		this.listaDeElementos = new ArrayList<Integer>();
		this.maxElementos = 4;
	}

	public synchronized void incrementar(int elemento) {
		while (this.listaDeElementos.size() == maxElementos) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.listaDeElementos.add(elemento);
		notify();
	}

	public synchronized int decrementar() {
		while (this.listaDeElementos.size() == 0) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		notify();
		return this.listaDeElementos.remove(this.listaDeElementos.size() - 1);
	}

}
