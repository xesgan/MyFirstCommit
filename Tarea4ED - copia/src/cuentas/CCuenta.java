package cuentas;

/**
 * Esta clase representa una cuenta bancaria, e implementa la lógica
 * para manipular retiradas e ingresos
 * @author PauCasesnoves CIFP
 * @version 1.0
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Contructor por defecto porque no tengo muy claro por qué está escrito esto
     */

    public CCuenta() {
    }

    /**
     * Contructor con parámetros
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método que devuelve el saldo actual
     * @return El saldo actual
     */

    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad a ingresar.
     * @throws Exception Si la cuenta es negativa.
     */

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad a retirar.
     * @throws Exception si no hay suficiente saldo o si es negativa.
     */

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para el nombre del titular de la cuenta
     * @param nombre del titular.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el número de cuenta
     * @return número de cuenta.
     */

    public String getCuenta() {
        return cuenta;
    }

    /**
     * método setter para cambiar el número de cuenta
     * @param cuenta número de cuenta
     */

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter para obtener el saldo de la cuenta
     * @return saldo cuenta.
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para modificar el saldo de la cuenta
     * @param saldo de la cuenta
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter para saber el tipo de interés de la cuenta
     * @return tipo de interés.
     */

    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para modificar el tipo de interés de la cuenta
     * @param tipoInterés de la cuenta
     */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
