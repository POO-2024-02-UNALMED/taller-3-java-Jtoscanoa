package taller3.televisores;

public class Control {
    private TV tv;


    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return this.tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        if (this.tv != null) {
            this.tv.turnOn();
        }
    }

    public void turnOff() {
        if (this.tv != null) {
            this.tv.turnOff();
        }
    }

    public void canalUp() {
        if (this.tv != null) {
            this.tv.canalUp();
        }
    }

    public void canalDown() {
        if (this.tv != null) {
            this.tv.canalDown();
        }
    }

    public void volumenUp() {
        if (this.tv != null) {
            this.tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (this.tv != null) {
            this.tv.volumenDown();
        }
    }

    public void setCanal(int canal) {
        if (this.tv != null) {
            this.tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (this.tv != null) {
            this.tv.setVolumen(volumen);
        }
    }
}