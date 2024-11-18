package test;

import taller3.televisores.TV;

public class Control {
    private taller3.televisores.TV tv;
//    public Control(TV tv) {
//        this.tv = tv;
//        tv.setControl(this);
//    }
    public taller3.televisores.TV getTv() {
        return tv;
    }
    public void setTv(taller3.televisores.TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }
}
