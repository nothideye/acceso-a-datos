package main;

import java.io.Serializable;

public class Coche implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String marca;
	private String modelo;
	private String matricula;
	private int anyoMatriculacion;
	private int precio;
	
	public Coche(String marca, String modelo, String matricula, int anyoMatriculacion, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anyoMatriculacion = anyoMatriculacion;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnyoMatriculacion() {
		return anyoMatriculacion;
	}

	public void setAnyoMatriculacion(int anyoMatriculacion) {
		this.anyoMatriculacion = anyoMatriculacion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anyoMatriculacion="
				+ anyoMatriculacion + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
