package listaCanciones;

public class Lista {

	private String nombre;
	private int numeroCanciones;
	private Cancion cancion;
	
	public Lista() {
		
	}
	
	public Lista(String nombre, int numeroCanciones, Cancion cancion) {
		super();
		this.nombre = nombre;
		this.numeroCanciones = numeroCanciones;
		this.cancion = cancion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCanciones() {
		return numeroCanciones;
	}

	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	@Override
	public String toString() {
		return "Lista [nombre=" + nombre + ", numeroCanciones=" + numeroCanciones + ", cancion=" + cancion + "]";
	}
	
}