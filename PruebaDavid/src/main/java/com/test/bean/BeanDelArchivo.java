package com.test.bean;

/**
 * 
 * @author DavidFernando
 *
 */
public class BeanDelArchivo {
	public BeanDelArchivo() {
	}
	private String estadoCuentaDeb;
	private String cuentaDeb;
	public String getEstadoCuentaDeb() {
		return estadoCuentaDeb;
	}
	public void setEstadoCuentaDeb(String estadoCuentaDeb) {
		this.estadoCuentaDeb = estadoCuentaDeb;
	}
	public String getCuentaDeb() {
		return cuentaDeb;
	}
	public void setCuentaDeb(String cuentaDeb) {
		this.cuentaDeb = cuentaDeb;
	}
	public String getNombreClienteDeb() {
		return nombreClienteDeb;
	}
	public void setNombreClienteDeb(String nombreClienteDeb) {
		this.nombreClienteDeb = nombreClienteDeb;
	}
	public String getEstadoCuentaCre() {
		return estadoCuentaCre;
	}
	public void setEstadoCuentaCre(String estadoCuentaCre) {
		this.estadoCuentaCre = estadoCuentaCre;
	}
	public String getCuentaCre() {
		return cuentaCre;
	}
	public void setCuentaCre(String cuentaCre) {
		this.cuentaCre = cuentaCre;
	}
	public String getNombreClienteCre() {
		return nombreClienteCre;
	}
	public void setNombreClienteCre(String nombreClienteCre) {
		this.nombreClienteCre = nombreClienteCre;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	private String nombreClienteDeb;
	private String estadoCuentaCre;
	private String cuentaCre;
	private String nombreClienteCre;
	private double monto;
	public double montoReal;
	public double getMontoReal() {
		return montoReal;
	}
	public void setMontoReal(double montoReal) {
		this.montoReal = montoReal;
	}

}
