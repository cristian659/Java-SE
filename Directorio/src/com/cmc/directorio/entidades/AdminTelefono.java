package com.cmc.directorio.entidades;
public class AdminTelefono {
	
	public void ActivarMensajeria (Telefono telefono){
		
		if(telefono.getOperadora()=="movi"){
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telefono, Telefono telf,	Telefono tel){
		
		int i = 0;
		
		if(telefono.getOperadora()=="movi"){
			i++;
			
		}if(tel.getOperadora()=="movi"){
			i++;
			
		}if(telf.getOperadora()=="movi"){
			i++;
		}
		return i;
		
	}
public int contarMoviC(Telefono telefono, Telefono telf,	Telefono tel, Telefono tele){
		
		int i = 0;
		
		if(telefono.getOperadora()=="claro"){
			i++;
			
		}if(tel.getOperadora()=="claro"){
			i++;
			
		}if(telf.getOperadora()=="claro"){
			i++;
		}if(tele.getOperadora()=="claro"){
			i++;
		}
		return i;
		
	}

}
