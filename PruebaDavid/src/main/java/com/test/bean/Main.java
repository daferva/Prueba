package com.test.bean;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.test.utils.LoadFiles;

/**
 * 
 * @author DavidFernando
 *
 */
public class Main {

	public static void main(String[] args) {
		List<BeanDelArchivo> transacciones = new ArrayList<BeanDelArchivo>();
		try {
			System.out.println(" Lee el Archivo");
			LoadFiles.leer(transacciones);
		}catch (IOException ioEx) {
			System.out.println(ioEx.getMessage());
		}
		
		for (BeanDelArchivo bean : transacciones) {
			cobrarComission(bean);
		}
		
        Gson gson = new Gson();
        for (BeanDelArchivo beanJson : transacciones) {
            System.out.println("Esto es el json: "+ gson.toJson(beanJson));
			
		}


	}

	private static void cobrarComission(BeanDelArchivo bean) {
		if(bean.getEstadoCuentaDeb().equals("01") && bean.getEstadoCuentaCre().equals("01"))
			bean.setMontoReal(bean.getMonto()*1.02);
		else
			System.out.println("Las cuentas " +bean.getCuentaDeb() + " y " + bean.getCuentaCre() + " NO van a ser procesadas.");
		
	}

}
