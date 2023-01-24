package canciones;

import java.util.ArrayList;

public class Lista {
	
	private String nombreLista;
	private int numeroCanciones;
	private ArrayList <Cancion> listaCanciones;
	
	
	public Lista(int numeroCanciones, String nombreLista, ArrayList<Cancion> listaCanciones) {
		super();
		this.numeroCanciones = numeroCanciones;
		this.nombreLista = nombreLista;
		this.listaCanciones = listaCanciones;
	}

	public Lista() {
		listaCanciones = new ArrayList<Cancion>();
	}

	public int getNumeroCanciones() {
		return numeroCanciones;
	}


	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}


	public String getNombreLista() {
		return nombreLista;
	}


	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}


	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}


	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}


	@Override
	public String toString() {
		return "Lista [numeroCanciones=" + numeroCanciones + ", nombreLista=" + nombreLista + ", listaCanciones="
				+ listaCanciones + "]";
	} 
	
	
	

}
