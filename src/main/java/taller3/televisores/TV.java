package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    int volumen = 1;
    int serial;
    int numTV = 0;
    boolean estado;
    Control control;
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.serial = numTV;
        numTV++;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return control;
    }
    public void setSerial(int serial){
        this.serial = serial;
    }
    public int getSerial(){
        return serial;
    }
    public void setNumTV(int numTV){
        this.numTV = numTV;
    }
    public int getNumTV(){
        return numTV;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        if (this.estado = true){
            if (this.canal>1 && 120>this.canal){
                this.canal++;
            }
        }
    }
    public void canalDown(){
        if (this.estado = true){
            if (this.canal>1 && 120>this.canal){
                this.canal--;
            }
        }
    }
    public void volumenUp(){
        if (this.estado = true){
            if (this.volumen>0 && 7>this.volumen){
                volumen++;
            }
        }
    }
    public void volumenDown(){
        if (this.estado = true){
            if (this.volumen>0 && 7>this.volumen){
                volumen--;
            }
        }
    }
}
