package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// números impares
		int n = 1;
		System.out.println("Usando WHILE");
 
		while (n <= 99) {
			if(n%2 != 0) {
				System.out.println(n);
			}
			n++;
		}
		
		n =1;
		System.out.println("Usando DO WHILE");
		do {
			if(n%2 != 0) {
				System.out.println(n);
			}
			n++;
		}while(n <= 99);
		
		System.out.println("Usando FOR");
		for(int i = 1; i <= 99; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	} //main

} //main
