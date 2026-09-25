package Ejercicios_1;

public class PersonaPrincipal {
	
	/**
	 * Lazamos dos hilos de persona, que cada una de ellas hace 3 operaciones, y despues finaliza.
	 * @param args
	 */
	public static void main(String[] args) {
		// Bi Hari sortzen doguz
		PersonaHilo pers1 = new PersonaHilo("Joseba");
		PersonaHilo pers2 = new PersonaHilo("Koldobika");
		
		// Lazamos los dos hilos
		pers1.start();
		pers2.start();
			

	}



}
