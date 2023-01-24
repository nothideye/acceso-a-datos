package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Declaramos todas las variables que necesitaremos y creamos los objetos que
		 * usaremos en el programa
		 */

		ArrayList<Coche> coches;
		String opcion, matriculaIntroducida;
		String ruta = "coches.dat";
		File f = new File(ruta);
		Scanner sc = new Scanner(System.in);
		/*
		 * Hacemos un if para que el programa compruebe si el archivo existe o no y si
		 * existe y está vacio no ingrese null
		 */

		if (!f.exists()) {
			coches = new ArrayList<Coche>();

		} else {
			coches = deserializar(ruta);
		}
		/*
		 * Llamamos al metodo menu que es recurso ya que cuando termina se llama así
		 * mismo Y tambien llammaos a serializar
		 */

		menu(coches, ruta);
		serializar(coches, ruta);
	}

	///////////////////////////////// termina el programa
	///////////////////////////////// ////////////////////////////////////////////////

	/*
	 * Metodo serializar
	 * 
	 */
	public static void serializar(ArrayList<Coche> coches, String ruta) {

		FileOutputStream fos;
		ObjectOutputStream oos;
		File f = new File(ruta);

		try {
			fos = new FileOutputStream(ruta);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(coches);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Metodo de deserializar
	 */
	public static ArrayList<Coche> deserializar(String ruta) {

		ArrayList<Coche> coches = null;
		FileInputStream fis;
		ObjectInputStream ois;
		File f = new File(ruta);

		try {
			fis = new FileInputStream(ruta);
			ois = new ObjectInputStream(fis);

			coches = (ArrayList<Coche>) ois.readObject();

			fis.close();
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return coches;
	}

	/*
	 * Metodo menu de manera recursiva cada vez que termina una accion se llama asi
	 * mismo
	 */
	public static void menu(ArrayList<Coche> coches, String ruta) {

		String opcion;
		String matriculaIntroducida;
		System.out.println("---------------------------------------");
		System.out.print("Menu Coches, elige una opcion \n" + "1. Buscador de coches \n"
				+ "2. Introduce un nuevo coche \n" + "3. Salir \n");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextLine();
		switch (opcion) {
		case "1":
			if (coches.size() == 0) {
				System.out.println("No hay coches introducidos");
			} else {
				System.out.print("Introduce como quieres buscar, elige una opcion \n" + "1. Por matricula \n"
						+ "2. Por modelo \n");
				opcion = sc.nextLine();
				switch (opcion) {
				case "1":
					System.out.println("Introduce la matricula");
					opcion = sc.nextLine();
					for (Coche coche : coches) {
						if (coche.getMatricula().equals(opcion)) {
							System.out.println(coche);
							
						}
					}
					menu(coches, ruta);
					break;
				case "2":
					System.out.println("Indica el modelo");
					opcion = sc.nextLine();
					for (Coche coche : coches) {
						if (coche.getModelo().equals(opcion)) {
							System.out.println(coche);
							menu(coches, ruta);
						}
					}

				}

			}
			break;

		case "2":
			System.out.println("Introduce la marca del coche");
			String marc = sc.nextLine();
			System.out.println("Introduce el modelo del coche");
			String mod = sc.nextLine();
			System.out.println("Introduce la matricula del coche");
			String matr = sc.nextLine();
			System.out.println("Introduce el anyo de matriculacion");
			int anyoMat = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce el precio del coche");
			int pre = Integer.parseInt(sc.nextLine());

			coches.add(new Coche(marc, mod, matr, anyoMat, anyoMat));

			System.out.println(coches);
			serializar(coches, ruta);
			menu(coches, ruta);

			break;

		default:
			System.out.println("Apagando aplicacion");
			break;

		}

	}
}
