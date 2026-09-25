package Ejercicios_1;

// Ejercicio para lanzar ESCRITORA

public class Principal {

	public static void main(String[] args) {
		// Instanciamos las clases con los hilos
		Escritora escrZenbakiak = new Escritora("Zenbakiak", true);
		Escritora escrHizkiak = new Escritora("Hizkiak", false);

		System.out.println("Empizo hilos escritora.");
		escrZenbakiak.start();
		escrHizkiak.start();

		//Exekuzioa sinkronizatu egiten dot
		try {
			escrHizkiak.join();
			escrZenbakiak.join();
		} catch (Exception e) {
		}

		System.out.println("Finalizo hilos escritora.");

	}

}
