package main.java.Practica2PSP;

import java.util.ArrayList;
import java.util.List;

public class Monitor {

    private List<Integer> listaDeElementos;
	private int maxElementos;

	public Monitor(int capacidad) {
		this.listaDeElementos = new ArrayList<Integer>(capacidad);
		this.maxElementos = capacidad ;
	}

	public synchronized void producir(Integer data, int id) {
		while (this.listaDeElementos.size() > maxElementos) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		listaDeElementos.add(id);
		notifyAll();
	}

	public synchronized int consumir(int id) {
		while (this.listaDeElementos.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Integer n = listaDeElementos.remove(0);

		notifyAll();
		return n;
		//return this.listaDeElementos.remove(this.listaDeElementos.size() - 1);
	}

}
