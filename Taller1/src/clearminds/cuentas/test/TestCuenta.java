package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1= new Cuenta("03476");
		cuenta1.setSaldo(444);
		
		Cuenta cuenta2 = new Cuenta("03476","D",98);
		
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("c");
		cuenta3.setSaldo(45);
		
		Cuenta cuenta4 = new Cuenta ("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557","c",10);
		
		Cuenta cuenta6 = new Cuenta("0666");
		
		System.out.println("--------Valored de Cuenta-------");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		System.out.println("--------Valored de Cuenta-------");

	}

}
