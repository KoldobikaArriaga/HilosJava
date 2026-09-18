package Hilos;

public class Raton extends Thread {
	private String nombre = "";
	private int tiempo = 0;

	public Raton(String nombre, int tiempo) {
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
		Raton raton1 = new Raton("Micky", 4);
		Raton raton2 = new Raton("Minie", 6);
		Raton raton3 = new Raton("Pixie", 2);

		// Establecer las prioridades
		raton1.setPriority(MAX_PRIORITY);
		raton2.setPriority(MIN_PRIORITY);
		raton3.setPriority(MIN_PRIORITY);
		
		// lazamos los ratones
		raton1.start();
		raton2.start();
		raton3.start();

		// Esperamos a que los tres terminen antes de continuar con el syso final
		// Probar a quitarlo para ver el orden de ejecución diferente.
		try {
			raton1.join();
			raton2.join();
			raton3.join();
		}catch(Exception e){
			
		}
		
		// Finalizamos la ejecución en el Main.
		System.out.println("Todos los ratones han terminado de comer.");

	}

}
