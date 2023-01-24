package persona;

import java.time.LocalDate;

public class Usuario {

	private String nombre;
	private int edad;
	private LocalDate fechaRegistro;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, int edad, LocalDate fechaRegistro) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Usuario:\n - Nombre: " + nombre + ".\n - Edad: " + edad + ".\n - Fecha de Registro: " + fechaRegistro + ".\n";
	}
	
}