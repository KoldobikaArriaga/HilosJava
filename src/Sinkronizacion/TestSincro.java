package Sinkronizacion;

public class TestSincro extends Thread {

	private volatile int saldo = 50; // Saldo en la cuenta bancaria
	private int retirada;

	public TestSincro(int retirada, String nombre) {
		super(nombre);
		this.retirada = retirada;
	}

	/**
	 * 
	 * @param cant
	 * @param nom
	 */
	synchronized void retirarDinero(int cant, String nom) {

		System.out.printf("La persona llamada %s va a retirar %d euros.\n", nom, cant);

		if (cant <= saldo) {
			// Procedemos a retirar la cantidad
			System.out.println("Se entregan " + cant + " € a " + this.getName());
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
			
			saldo = saldo - cant;
		} else {
			System.out.println("No se puede retirar fondos para " + this.getName());
		}

	}

	/**
	 * 
	 */
	public void run() {
		retirarDinero(this.retirada, this.getName());

		System.out.printf("Saldo despues de las operacion de %s: %d\n", this.getName(), saldo);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSincro(40, "Koldo").start(); // Uno retira 40 euskos
		new TestSincro(30, "Ainhoa").start(); // otro retira 30 euskos

	}

}
