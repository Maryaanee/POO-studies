package br.edu.figurasPlanas;

import java.util.Scanner;

public class Circulo {

	public double raio;
	public double area;
	
	public Circulo() {
		
	}
	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Rase: ");
		raio = sc.nextDouble();
	}
	
	public void recebeLado(double r) {
		raio = r;
	}
	
						
	public void calcArea() {
		area = (Math.PI  * raio * raio);
	}
	
	public void retornaLado() {
		System.out.println("O raio do circulo é: " +raio);
	}
	
	public void retornaArea() {
		System.out.println("A area do circulo é: " +area);
	}
	
	public void listaAtributos() {
		System.out.println("O raio do circulo é: " +raio);
		System.out.println("A area do quadrado é: " +area);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
