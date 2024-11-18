package test;

import taller3.televisores.Control;
import taller3.televisores.Marca;
import taller3.televisores.TV;

public class TestTV {
	public static void main(String[] args) {
		taller3.televisores.Marca marca1 = new taller3.televisores.Marca("Semsung");
	    taller3.televisores.Marca marca2 = new Marca("Lj");
		
	    taller3.televisores.TV tv1 = new taller3.televisores.TV(marca1, true);
	    taller3.televisores.TV tv2 = new TV(marca2, false);
	    
	    tv1.setPrecio(2000);
	    tv2.setCanal(90);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		
		taller3.televisores.Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();
		
	    System.out.println(tv2.getCanal());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	}
}