package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		System.out.println(potencia(2, 5));
		System.out.println(fibonacci(10));

	}
	
	public static int factorial(int n) {
		
		if (n==1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
				
	}
	
	public static int potencia(int base, int exp) {
		
		if (exp == 1) {
			return base;
		} else {
			return base * potencia(base, exp - 1);
		}
		
	}
	
	public static int fibonacci(int n) {
		
		if (n==1 || n==2) {
			return 1;
		} else {
			return (fibonacci(n - 1) + fibonacci(n - 2));
		}
		
	}

}