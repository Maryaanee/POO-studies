package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota N1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a nota N2: ");
		n2 = sc.nextDouble();
		
		m = (n1*2 + n2*3)/5;
		
		System.out.println("A média do aluno foi: " + m );
		
		if(m >= 6) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado;");
		}

	}

}
