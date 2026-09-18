package Hilos;

public class EjemploTheard extends Thread{
	


	public EjemploTheard(String str) {
		super(str);
	}
	
	public void run() {
		for( int i=0; i < 10; i++) {
			System.out.println(i + " " + getName());
		}
		
		System.out.println("Temina el Thread " + getName());
	}

	public static void main(String[] args) {
		// Lanzamos dos Hilos
		
		new EjemploTheard("Koldobika").start();
		new EjemploTheard("Joseba").start();
		
		System.out.println("Termina el Hilo Principal.");

	}

}
