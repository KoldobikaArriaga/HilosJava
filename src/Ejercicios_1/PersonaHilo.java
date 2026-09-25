package Ejercicios_1;

public class PersonaHilo extends Thread {

	/**
	 * Constructor
	 * @param izena
	 */
	public PersonaHilo(String izena) {
		super(izena);
	}
	
	public void run() {
		
		// Hiru eragiketa egiten doguz
		for(int i=1; i <= 3; i++) {
			System.out.println("Eragiketa " + i);
			
			// 10 milisegundo itxioten doguz hiru atazen artean
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
