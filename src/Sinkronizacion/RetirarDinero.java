package Sinkronizacion;

public class RetirarDinero {

    private int saldo = 40;

    public synchronized void retirarDinero(int cantidad, String nombre) {

        System.out.println(nombre + " intenta retirar " + cantidad + " euros.");

        if (saldo >= cantidad) {

            System.out.println(nombre + " puede retirar el dinero.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            saldo = saldo - cantidad;

            System.out.println(nombre + " ha retirado " + cantidad + " euros.");
            System.out.println("Saldo restante: " + saldo + " euros.");

        } else {

            System.out.println(nombre + " no puede retirar el dinero.");
            System.out.println("Saldo insuficiente.");

        }
    }
    
    public static void main(String[] args) {
        RetirarDinero cuenta = new RetirarDinero();

        Cajero pers1 = new Cajero("Koldo", cuenta, 40);

        Cajero pers2 = new Cajero("Ainhoa", cuenta, 30);

        pers1.start();
        pers2.start();
    }

}
