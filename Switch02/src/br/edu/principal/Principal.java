package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();
		
		switch(dia) {
		case 1 -> System.out.println("DOM");
		case 2 -> System.out.println("SEG");
		case 3 -> System.out.println("TER");
		case 4 -> System.out.println("QUA");
		case 5 -> System.out.println("QUI");
		case 6 -> System.out.println("SEX");
		case 7 -> System.out.println("SÁB");
		default -> System.out.println("Dia não existe");
		}
		System.out.println("Fim do progama");

	}

}
