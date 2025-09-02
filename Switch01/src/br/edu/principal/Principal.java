package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Dom");
			break;
		case 2:
			System.out.println("Seg");
			break;
		case 3:
			System.out.println("Ter");
			break;
		case 4:
			System.out.println("Qua");
			break;
		case 5:
			System.out.println("Qui");
			break;
		case 6:
			System.out.println("Sex");
			break;
		case 7:
			System.out.println("Sáb");
			break;
		default:
			System.out.println("Dia não existe");
		}
		System.out.println("Fim do progama");
	
	}

}
