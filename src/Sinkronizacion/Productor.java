package Sinkronizacion;

public class Productor extends Thread {

	private Contenedor contenedor;

	// Constructor
	public Productor(Contenedor c) {
		contenedor = c;
	}

	// Ejecución del Hilo
	public void run() {

		for (int i = 0; i < 10; i++) {
			contenedor.put(i);
			System.out.println("Productor put ==> " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException interrupcion) {

			}

		}
	}
}
