package streams;

public class Persona {

	private String nombre, apellido;
	private int edad;
	private boolean mayorDeEdad;
	
	public Persona(String nombre, String apellido, int edad, boolean mayorDeEdad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.mayorDeEdad = mayorDeEdad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isMayorDeEdad() {
		return mayorDeEdad;
	}
	public void setMayorDeEdad(boolean mayorDeEdad) {
		this.mayorDeEdad = mayorDeEdad;
	}

	@Override
	public String toString() {
		return "\nDatos de la persona:\n - Nombre: " + nombre + ".\n - Apellido: " + apellido + ".\n - Edad: " + edad + ".\n - Es mayor de edad: "+ (mayorDeEdad ? "Si" : "No") + ".\n";
	}
	
}