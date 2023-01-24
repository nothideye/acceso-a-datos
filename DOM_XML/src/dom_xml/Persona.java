package dom_xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private String nombre, apellidos;
	private Date nacimiento;
	
	public Persona(String nombre, String apellidos, Date nacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
	}
	
	public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "- Nombre:" + nombre + ".\n - Apellidos: " + apellidos + ".\n - Nacimiento: " + nacimiento + ".";
	}
	
}