package Sinkronizacion;

public class ProductorConsumidorPrincipal {

	public static void main(String[] args) {
		// Lanzamos los hilos
		
		Contenedor cont = new Contenedor(99);
		Productor produce = new Productor(cont);
		Consumidor consume = new Consumidor(cont);
		
		produce.start();
		consume.start();

	}

}
