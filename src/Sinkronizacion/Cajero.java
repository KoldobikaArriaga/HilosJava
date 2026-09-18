package Sinkronizacion;

public class Cajero extends Thread {

    private RetirarDinero cuenta;
    private int cantidad;

    public Cajero(String nombre, RetirarDinero cuenta, int cantidad) {

        super(nombre);

        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

	@Override
    public void run() {

        cuenta.retirarDinero(cantidad, getName());

    }
}
