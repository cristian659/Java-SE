package clearminds.cuentas;

public class Cuenta {
private String id;
private String tipo = "A";
private int saldo;


//metodo imprimir
public void imprimirConMiEstilo() {
	System.out.println("**************");
	System.out.println("CUENTA");
	System.out.println("**************");
	System.out.println("numero de cuenta:"+id);
	System.out.println("tipo:"+tipo);
	System.out.println("saldo: USD"+saldo);
	
}
//constructor


public Cuenta(String id, String tipo, int saldo) {
	//super();
	this.id = id;
	this.tipo = tipo;
	this.saldo = saldo;
}
public Cuenta(String id) {
	//super();
	this.id = id;
}

public Cuenta(String id,int saldo){
	this.id=id;
	this.saldo=saldo;
}
//get and set
private String getId(){
	return id;
}

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}


}
