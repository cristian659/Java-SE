package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	Celda celda1 = new Celda("");
	Celda celda2 = new Celda("");
	Celda celda3 = new Celda("");
	Celda celda4 = new Celda("");
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}



	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}



	public Celda getCelda2() {
		return celda2;
	}



	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}



	public Celda getCelda3() {
		return celda3;
	}



	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}



	public Celda getCelda4() {
		return celda4;
	}



	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void configurarMaquina(String codigo1,String codigo2,String codigo3,String codigo4){
		celda1.setCodigo(codigo1);
		celda2.setCodigo(codigo2);
		celda3.setCodigo(codigo3);
		celda4.setCodigo(codigo4);
		
	}
	public void mostrarConfiguracion(){
		System.out.println("codigo celda1"+celda1.getCodigo());
		System.out.println("codigo celda2"+celda2.getCodigo());
		System.out.println("codigo celda3"+celda3.getCodigo());
		System.out.println("codigo celda4"+celda4.getCodigo());
		
		System.out.println("saldo actual: "+ saldo);
	}
	public Celda buscarCelda(String codigocelda){
		if(codigocelda==celda1.getCodigo()){
			return celda1;
		}else if(codigocelda==celda2.getCodigo()){
			return celda2;
		}else if(codigocelda==celda3.getCodigo()){
			return celda3;
		}else if(codigocelda==celda4.getCodigo()){
			return celda4;
		}else{
			return null;
		}
	}
	
	public void cargarProducto(Producto atributo,String codigocelda, int item){
		Celda celdaRecuperada = buscarCelda(codigocelda);
		celdaRecuperada.ingresarProducto(atributo, item);
	}
	
	public void mostrarProductos(){
		
		 System.out.println("***CELDA "+celda1.getCodigo());
	        System.out.println("Stock:"+celda1.getStock());
	        if(celda1.getProducto()!=null){
	        	System.out.println("Nombre:"+celda1.getProducto().getNombre());
	            System.out.println("Codigo:"+celda1.getProducto().getCodigo());
	            System.out.println("Precio:"+celda1.getProducto().getPrecio());
	        }else{
	            System.out.println("la celda no tiene producto !!!");
	        }
	        //Celda2
	        System.out.println("***CELDA "+celda2.getCodigo());
	        System.out.println("Stock:"+celda2.getStock());

	        if(celda2.getProducto()!=null){
	            System.out.println("Celda: "+celda2.getProducto());
	        }else{
	            System.out.println("la celda no tiene producto !!!");
	        }
	        //Celda3
	        System.out.println("**CELDA "+celda3.getCodigo());
	        System.out.println("Stock:"+celda3.getStock());
	        if(celda3.getProducto()!=null){
	            System.out.println("Nombre:"+celda3.getProducto().getNombre());
	            System.out.println("Codigo:"+celda3.getProducto().getCodigo());
	            System.out.println("Precio:"+celda3.getProducto().getPrecio());
	        }else{
	            System.out.println("la celda no tiene producto !!!");
	        }

	      //Celda4
	        System.out.println("**CELDA "+celda4.getCodigo());
	        System.out.println("Stock:"+celda4.getStock());

	        if(celda4.getProducto()!=null){
	        	System.out.println("Nombre:"+celda4.getProducto().getNombre());
	            System.out.println("Codigo:"+celda4.getProducto().getCodigo());
	            System.out.println("Precio:"+celda4.getProducto().getPrecio());
	        }else{
	            System.out.println("la celda no tiene producto !!!");
	        }
	        System.out.println("Saldo: "+saldo);

	}
	
	public Producto buscarProductoEnCelda(String codigocelda){
		Celda celdaEncontrada = buscarCelda(codigocelda);
		
		if(celdaEncontrada != null){
			return celdaEncontrada.getProducto();
		}else{
			return null;
		}
	}
	
	public double consultarPrecio(String codigocelda){
		Celda celdaEncontrada = buscarCelda(codigocelda);
		if(celdaEncontrada != null){
			return celdaEncontrada.getProducto().getPrecio();
		}else{
			return 0;
		}
		
	}
	
	public Celda buscarCeldaProducto(String codigoproducto){
		
		if(celda1.getProducto() != null){
			if(codigoproducto.equals(celda1.getProducto().getCodigo())){
				return celda1;
			}
		}else if(celda2.getProducto() != null){
			if(codigoproducto.equals(celda2.getProducto().getCodigo())){
				return celda2;
			}
		}else if(celda3.getProducto() != null){
			if(codigoproducto.equals(celda3.getProducto().getCodigo())){
				return celda3;
			}
			}else if(celda4.getProducto() != null){
				if(codigoproducto.equals(celda4.getProducto().getCodigo())){
					return celda4;
				}
			}
		return null;
	}
	public void incrementarProductos(String codigoproducto, int items){
		Celda celdaEncontrada = buscarCeldaProducto(codigoproducto);
		celdaEncontrada.setStock(items+celdaEncontrada.getStock());
	}
	public void vender(String codigocelda){
		Celda celdaEncontrada = buscarCelda(codigocelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1); 
		saldo = celdaEncontrada.getProducto().getPrecio()+saldo;
		mostrarProductos();
	}
	public double venderConCambio(String codigocelda, double valor){
		Celda celdaEncontrada = buscarCelda(codigocelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1); 
		valor = valor - celdaEncontrada.getProducto().getPrecio();
		return valor;
	}

}
