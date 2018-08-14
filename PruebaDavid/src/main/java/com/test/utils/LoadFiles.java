package com.test.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.test.bean.BeanDelArchivo;

/**
 * 
 * @author DavidFernando
 *
 */
public class LoadFiles {
	static String ruta = "W:\\eclipse-workspace\\PruebaDavid\\src\\main\\resources\\trama-test.txt";
	
	/**
	 * 
	 * @param transacciones 
	 * @throws IOException
	 */
	public static void leer(List<BeanDelArchivo> transacciones) throws IOException {
		File archivo = new File (ruta);
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null) {
        	BeanDelArchivo bean = new BeanDelArchivo();
        	bean.setEstadoCuentaDeb(linea.substring(0,2)); //Estado cuenta debito
        	bean.setCuentaDeb(linea.substring(2,12)); //Cuenta debito
        	bean.setNombreClienteDeb(linea.substring(12,42)); //Nombre cliente debito
        	
        	bean.setEstadoCuentaCre(linea.substring(42,44)); //Estado cuenta credito
        	bean.setCuentaCre(linea.substring(44,54)); //Cuenta credito
        	bean.setNombreClienteCre(linea.substring(54,84)); //Nombre cliente debito
        	
        	bean.setMonto(Double.valueOf(linea.substring(84,100))); //Nombre cliente debito
        	
        	transacciones.add(bean);
        }
           
        
        br.close();
	}

}

