package main;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		eliminar("Carpeta");

	}
	
	public static void eliminar(String path) {
		
		File file = new File(path);
		
		if (file.isDirectory()) {
			
			for (File f : file.listFiles()) {
				
				if (f.isDirectory()) {
					eliminar(f.getAbsolutePath());
				}
				
				System.out.println("Eliminando " + f.getName() + " ...");
				// Borramos los archivos de dentro de la carpeta
				f.delete();
			}	
			
		} else {
			
			System.out.println("No es un directorio.");
			file.delete();
			
		}
				
		// Una vez hemos borrado los archivos, borramos la carpeta
		file.delete();
		
	}

}