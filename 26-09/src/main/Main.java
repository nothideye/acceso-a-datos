package main;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			int byteLeido;
			String persona;
			RandomAccessFile file = new RandomAccessFile(new File("prueba.txt"), "rw");
			
			//System.out.println(file.length());
			
			file.seek(12*3);
			file.writeBytes("Alejandra40\n");
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}