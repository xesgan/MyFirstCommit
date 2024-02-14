package cuentas;

/**
 * Esta clase contiene el método main para probar la clase CCuenta.
 */
public class Main {

    /**
     * Método main para la clase CCuenta.
     * @param args los argumentos de la línea de comandos.
     */

    public static void main(String[] args) {
        operativa_cuenta(0.0F);
    }

    /**
     * Método para realizar operaciones con una cuenta bancaria.
     * @param cantidad La cantidad inicial de la cuenta.
     */

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es (encuentra a wally)"+ saldoActual );
        System.out.println("Me gusta programar, pero es difícil.");
        try {
            cuenta1.retirar(2300.0);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


