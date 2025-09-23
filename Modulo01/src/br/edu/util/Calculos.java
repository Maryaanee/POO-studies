package br.edu.util;

import java.util.Scanner;

public class Calculos {
	static Scanner scanner = new Scanner(System.in);
	static double nota1, nota2,af,media,mf;
	
	public static double calcMedia(double n1, double n2) {
		nota1 = n1; nota2 = n2;
		media = (nota1 * 2 + nota2 * 3) / 5;
		System.out.printf("A média do(a) aluno(a) foi: %.2f%n", media);
		return media;
	}

	public static double CalcMediaFinal(double avf) {
		af = avf;
		mf = (af + media) /2;
		System.out.printf("A média Final do(a) aluno(a) foi %.2f%n", mf);
		if (mf >= 5) {
			System.out.printf("Aluno ESCAPOU FEDENDO!");
		}
		else {
			System.out.printf("Aluno REPROVADO");
		}
		return mf;
	}
	
	public static String verificaAprovacao(double m) {
		media = m;
		if (media >= 6) {
			System.out.println("Aluno APROVADO");
			return "AP";
		}
		else if (media >= 3) {
			System.out.println("O aluno está em RECUPERAÇÃO");
			return "REC";
		}
		else {
			System.out.println("REPROVADO");
			return "REP";
		}
		
	}
	public static void verificaSituacaoFinal(String msg) {
		String situacao = msg;
		if(situacao.equals("REC")) {
			double avf = RecebeDados.recebeNotaF();
			double mf = Calculos.CalcMediaFinal(avf);
		}
	
	}
}
