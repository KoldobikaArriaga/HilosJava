package Sinkronizacion;

public class Contenedor {

	private int dato = 0;
	private boolean bHayDato = false;

	public Contenedor(int valor) {
		super();
		this.dato = valor;
	}

	/**
	 * 
	 * @return
	 */
	public synchronized int get() {

		// Esperamos hasta que haya dato
		while (bHayDato == false) {
			try {
				// Esperar a que el productor coloque un valor
				wait();
			} catch (InterruptedException interrupcion) {
				// o hacemos nada, directamente salimos del while aqui.
			}
		}

		bHayDato = false;

		// Ahora NOTIFICAMOS de que ya NO hay dato
		notifyAll();

		return (this.dato);
	}

	/**
	 * 
	 * @param balorea
	 */
	public synchronized void put(int balorea) {

		while (bHayDato == true) {

			try {
				// Esperar a que se consuma el dato
				wait();
			} catch (InterruptedException interrupción) {
				// Punto de salida del while gracias a la interrupción.
			}
		}

		this.dato = balorea;
		bHayDato = true;

		// Ahora NOTIFICAMOS de que SI hay dato
		notifyAll();

	}
}
