package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Retorna o valor
		int dia;
		String nomeDia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();
		
		nomeDia = switch(dia) {
		case 1 -> ("DOM");
		case 2 -> ("SEG");
		case 3 -> ("TER");
		case 4 -> ("QUA");
		case 5 -> ("QUI");
		case 6 -> ("SEX");
		case 7 -> ("SÁB");
		default -> ("Dia não existe");
		};
		System.out.println("O dia digitado foi: " + nomeDia);
		System.out.println("Fim do progama");

	}

}
