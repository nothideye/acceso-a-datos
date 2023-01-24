package streams;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		int byteLeido;
		byte[] bytesLeidos = new byte[3];
		
		System.out.print("Introduce algo: ");
		
		try {
			
			byteLeido = System.in.read();
			System.in.read();
			System.in.read();
			System.out.println("El byte: " + (char) byteLeido + "\n");
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.print("Introduce varias letras: ");
		
		try {
			
			System.in.read(bytesLeidos);
			System.in.read();
			System.in.read();
			System.out.println("Los bytes: " + new String(bytesLeidos) + "\n");
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.print("Introduce varias letras: ");
		
		try {
			
			System.in.read(bytesLeidos, 1, 2);
			System.in.read();
			System.in.read();
			System.out.println("Los bytes: " + new String(bytesLeidos) + "\n");
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}
}