package Ejercicios_1;

// Hilo lanzado desde PRINCIPAL

public class Escritora extends Thread {

	private boolean bAccion;
	/**
	 * 
	 * @param izena
	 * @param accion -> booleano. Si true, cuenta numeros. Si False, cuenta letras.
	 */
	public Escritora(String izena, boolean accion) {
		super(izena);
		bAccion = accion;
	}
	
	/**
	 * Lazamiento a ejecución del hilo
	 */
	public void run() {

		if( bAccion) {
			// Zenbatu zenbakiak
			for(int i=1; i <=30; i++) {
				System.out.println("==> " + i);
			}
		}
		else {
			// Zenbatu hizkiak
			char primera = 'a';
			char ultima = 'z';
			for(char i= primera; i <= ultima; i++ ) {
				System.out.println("> " + i);
			}
		}
	}
	

}
