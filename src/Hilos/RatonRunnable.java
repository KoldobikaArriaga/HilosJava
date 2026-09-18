package Hilos;

public class RatonRunnable implements Runnable {
	private String nombre = "";
	private int tiempo = 0;

	public RatonRunnable(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public void comer() {

		try {
			System.out.printf("El Raton %s empieza a comer %n", nombre);
			// Tiempo que se pasa comiendo
			Thread.sleep(tiempo * 1000);
			System.out.printf("El Raton %s termina de comer%n", nombre);
		} catch (InterruptedException interrupcion) {
		}
	}

	public void run() {
		comer();
	}

	public static void main(String[] args) {
		// Lanzamos los ratones a comer
		RatonRunnable raton1 = new RatonRunnable("Micky", 4);
		RatonRunnable raton2 = new RatonRunnable("Pixie", 4);
		RatonRunnable raton3 = new RatonRunnable("Mouse", 4);

		// lazamos los ratones
		new Thread(raton1).start();
		new Thread(raton2).start();
		new Thread(raton3).start();

		System.out.println("Todos los ratones han terminado de comer.");

	}

	private void join() {
		// TODO Auto-generated method stub
		
	}

}
