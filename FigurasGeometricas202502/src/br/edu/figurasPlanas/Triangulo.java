package br.edu.figurasPlanas;

import java.util.Scanner;

public class Triangulo {

		public double base;
		public double altura;
		public double area;
		
		public Triangulo() {
			
		}
		public void recebaBase() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor da base: ");
			base = sc.nextDouble();
		}
		
		public void recebaBase(double b) {
			base = b;
		}
		
		public void recebaAltura() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor da altura: ");
			altura = sc.nextDouble();
		}
		
		public void recebaAltura(double h) {
			altura = h;
		}
				
		public void calcArea() {
			area = (base * altura)/2;
		}
		
		public void retornarBase() {
			System.out.println("A base do triangulo é: " +base);
		}
		
		public void retornarAltura() {
			System.out.println("A altura do triangulo é: " +altura);
		}
		
		public void retornarArea() {
			System.out.println("A area do triangulo é: " +area);
		}
		
		public void listaAtributos() {
			System.out.println("A base do triangulo é: " +base);
			System.out.println("A altura do triangulo é: " +altura);
			System.out.println("A area do triangulo é: " +area);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		}
		
		
	}

