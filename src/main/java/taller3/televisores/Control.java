package taller3.televisores;

public class Control {
    private TV tv;
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void turnOn(){
        if (this.tv !=null){tv.turnOn();}
    }
    public void turnOff(){
        if (this.tv !=null){tv.turnOff();}
    }
    public void canalUp(){
        if (this.tv !=null){tv.canalUp();}
    }
    public void canalDown(){
        if (this.tv !=null){tv.canalDown();}
    }
    public void volumenUp(){
        if (this.tv !=null){tv.volumenUp();}
    }
    public void volumenDown(){
        if (this.tv !=null){tv.volumenDown();}
    }
    public void setCanal(int canal){
        if (this.tv !=null){tv.setCanal(canal);}
    }
    public void setVolumen(int volumen){
        if (this.tv !=null){tv.setVolumen(volumen);}
    }
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }
}
