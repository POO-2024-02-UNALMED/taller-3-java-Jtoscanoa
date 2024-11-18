package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private int volumen;
    private int serial;
    private static int numTV = 0; // Make numTV static
    private boolean estado;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1; // Default channel
        this.volumen = 1; // Default volume
        this.precio = 500; // Default price
        this.serial = numTV; // Assign serial number
        numTV++; // Increment static counter
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCanal(int canal) {
        if (this.estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setVolumen(int volumen) {
        if (this.estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }

    public int getSerial() {
        return serial;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }
}