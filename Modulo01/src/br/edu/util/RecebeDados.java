package br.edu.util;

import java.util.Scanner;

public class RecebeDados {
	static Scanner scanner = new Scanner(System.in);
	static String nome;
	public static void recebeNome() {
		System.out.println("Digite o nome do aluno: ");
		nome = scanner.nextLine();
	}
	
	public static double recebeNota1() {
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		return nota1;
	}
	
	public static double recebeNota2() {
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		return nota2;
	}
	
	public static double recebeNotaF() {
		System.out.println("Digite a nota da Final: ");
		double af = scanner.nextDouble();
		return af;
	}
} //class
