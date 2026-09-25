package Ejercicios_1;

public class ZenbatuMila extends Thread {

	/**
	 * Constructor, con nombre para clase padre
	 * @param izena
	 */
	public ZenbatuMila(String izena) {
		super(izena);
	}

	/**
	 * Programaren hasiera bi hariegaz
	 * @param args
	 */
	public static void main(String[] args) {
		// Mila arte zenbatu behar dabe bi hariak, eta gero amaitu
		ZenbatuMila zm1 = new ZenbatuMila("Koldobika");
		ZenbatuMila zm2 = new ZenbatuMila("Joseba");
		
		// Exekuziora bidaltzen doguz
		zm1.start();
		zm2.start();
		
		// Biak amaitu arte itxoiten dogu
		try {
			zm1.join();
			zm2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Sinkronizazioan Hutsuegitea.");
		}

		
		System.out.println("Hari nagusia amaitzen da.");
	}
	
	/**
	 * Thread bakoitzaren hasiera
	 */
	public void run() {
		
		// 1000 arte zenbatzen dogu
		for( int i=1; i <= 1000; i++) {
			System.out.println(i + " " + getName());
		}
		
		System.out.println("Temina el Thread " + getName());
	}

}
