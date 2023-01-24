package streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scannerLineas;
		Scanner scannerDatos;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String nombre, apellidos;
		int edad;
		boolean mayorEdad;
		
		try {
			scannerLineas = new Scanner(new File("E:\\DAM\\2º DAM\\Acceso a Datos\\Personas.txt"));
			
			while (scannerLineas.hasNextLine()) {
				
				scannerDatos = new Scanner(scannerLineas.nextLine());
				
				scannerDatos.useDelimiter(",");
				
				nombre = scannerDatos.next();
				apellidos = scannerDatos.next();
				edad = scannerDatos.nextInt();
				mayorEdad = scannerDatos.nextBoolean();
				
				personas.add(new Persona(nombre, apellidos, edad, mayorEdad));
				
				scannerDatos.close();
				
			}
			
			scannerLineas.close();
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
				
		System.out.println(personas.toString());
		
	}

}