package Hilos;

public class EjemploRunnable implements Runnable {

	public static void main(String[] args) {
		// Lanzamos los hilos con Runnable

		new Thread(new EjemploRunnable(), "Joseba").start();
		new Thread(new EjemploRunnable(), "Koldobika").start();

		System.out.println("Termina el hilo principal.");
	}

	@Override
	public void run() {
		// Ejecutamos cada hilo aqui

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}

		System.out.println("Termina el Hilo " + Thread.currentThread().getName());

	}

}
