package br.edu.figurasPlanas;

import java.util.Scanner;

public class Pentagono {
	 public double lado;
	    public double apotema;
	    public double area;

	    public Pentagono() {

	    }

	    public void recebaLado() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor do lado: ");
	        lado = sc.nextDouble();
	    }

	    public void recebaLado(double l) {
	        lado = l;
	    }

	    public void recebaApotema() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da apótema: ");
	        apotema = sc.nextDouble();
	    }

	    public void recebaApotema(double a) {
	        apotema = a;
	    }

	    public void calcArea() {
	        area = (5 * lado * apotema) / 2;
	    }

	    public void retornarLado() {
	        System.out.println("O lado do pentágono é: " + lado);
	    }

	    public void retornarApotema() {
	        System.out.println("A apótema do pentágono é: " + apotema);
	    }

	    public void retornarArea() {
	        System.out.println("A área do pentágono é: " + area);
	    }

	    public void listaAtributos() {
	        System.out.println("O lado do pentágono é: " + lado);
	        System.out.println("A apótema do pentágono é: " + apotema);
	        System.out.println("A área do pentágono é: " + area);
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    }
}
