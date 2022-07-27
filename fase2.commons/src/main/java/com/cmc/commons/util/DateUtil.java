package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date convertir(String date) throws Exception {
		
		Date fechaConvertida = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		return fechaConvertida;
		
	}
	
	
	
}