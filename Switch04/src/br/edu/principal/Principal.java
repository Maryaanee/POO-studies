package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		String nomeDia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();
		
		nomeDia = switch(dia) {
		case 1 -> {
			System.out.println("DOM");
			yield "DOM";
			}
		
		case 2 -> {
			System.out.println("SEG");
			yield "SEG";
			}
		
		case 3 -> {
			System.out.println("TER");
			yield "TER";
			}
		
		
		case 4 -> {
			System.out.println("QUA");
			yield "QUA";
			}
		
		case 5 -> {
			System.out.println("QUI");
			yield "QUI";
			}
		
		case 6 -> {
			System.out.println("SEX");
			yield "SEX";
			}
		
		case 7 -> {
			System.out.println("SÁB");
			yield "SÁB";
			}
		
		default -> ("Dia não existe");
		};
		System.out.println("O dia digitado foi: " + nomeDia);
		System.out.println("Fim do progama");



	}

}
