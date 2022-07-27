package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		Util util = new Util();
		boolean res = util.ValidarRango(5);
		System.out.println(res);
		
		res=Util.validarPositivo(6);
		System.out.println(res);

	}

}
