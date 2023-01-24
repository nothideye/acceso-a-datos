package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import coche.Coche;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche("Seat", "Panda", "0546BXJ", 2003, 2300.00);
		Coche c2 = new Coche("Renault", "Clio", "7348JSD", 2014, 6400.00);
		Coche c3 = new Coche("Honda", "Civic", "5489FZN", 2008, 4900.00);

		ArrayList<Coche> coches = new ArrayList<Coche>();
		ArrayList<Coche> cochesLeidos;
		
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);
		
		//Serializar(coches, "Coches.dat");
		cochesLeidos = Deserializar("Coches.dat");
		
		System.out.println(cochesLeidos);
		
	}
	
	public static void Serializar(ArrayList<Coche> coches, String ruta) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream(ruta);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(coches);
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static ArrayList<Coche> Deserializar(String ruta) {
		
		ArrayList<Coche> coches = null;
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream(ruta);
			ois = new ObjectInputStream(fis);
			
			coches = (ArrayList<Coche>) ois.readObject();
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return coches;
		
	}

}