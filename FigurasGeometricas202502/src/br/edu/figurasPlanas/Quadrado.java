package br.edu.figurasPlanas;

import java.util.Scanner;

public class Quadrado {


			public double lado;
			public double area;
			
			public Quadrado() {
				
			}
			public void recebeLado() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite o valor da base: ");
				lado = sc.nextDouble();
			}
			
			public void recebeLado(double l) {
				lado = l;
			}
			
								
			public void calcArea() {
				area = (lado * lado);
			}
			
			public void retornaLado() {
				System.out.println("O lado do quadrado é: " +lado);
			}
			
			public void retornaArea() {
				System.out.println("A area do quadrado é: " +area);
			}
			
			public void listaAtributos() {
				System.out.println("O lado do quadrado é: " +lado);
				System.out.println("A area do quadrado é: " +area);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
			}
			
			
		}

