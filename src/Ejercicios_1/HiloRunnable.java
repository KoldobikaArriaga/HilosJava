package Ejercicios_1;

import Hilos.EjemploRunnable;

public class HiloRunnable implements Runnable {


	public static void main(String[] args) {
		// Programaren hasiera
		
		// Bi hari sortzen dodaz
		Thread hariBat = new Thread( new HiloRunnable(),"HiloJoseba");
		Thread hariBi = new Thread( new HiloRunnable(),"HiloKoldobika");
		
		hariBat.start();
		hariBi.start();
		
		while( hariBat.isAlive() || hariBi.isAlive()) {
			
			if(hariBat.isAlive()) {
				System.out.println("===================> Joseba bizirik darrai.");
			}
			if(hariBat.isAlive()) {
				System.out.println("===================> KOldobika bizirik darrai.");
			}
			
		}
		
		System.out.println("=====> Termino el principal.");
		
		
	}

	@Override
	public void run() {
		// Hariaren exekuzioa
		for (int i = 0; i < 5000; i++) {
			if( (i % 50) == 0 ) {
				// Imprimo solo un mensaje cada 50 iteraciones
				System.out.println(i + " " + Thread.currentThread().getName());	
			}
		}

		System.out.println("Termina el Hilo " + Thread.currentThread().getName());
	}

}
