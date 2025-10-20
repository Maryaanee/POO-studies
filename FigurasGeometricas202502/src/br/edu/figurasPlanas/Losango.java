package br.edu.figurasPlanas;

import java.util.Scanner;

public class Losango {

	 public double diagonalMaior;
	    public double diagonalMenor;
	    public double area;

	    public Losango() {

	    }

	    public void recebaDiagonalMaior() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da diagonal maior: ");
	        diagonalMaior = sc.nextDouble();
	    }

	    public void recebaDiagonalMaior(double d) {
	        diagonalMaior = d;
	    }

	    public void recebaDiagonalMenor() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da diagonal menor: ");
	        diagonalMenor = sc.nextDouble();
	    }

	    public void recebaDiagonalMenor(double d) {
	        diagonalMenor = d;
	    }

	    public void calcArea() {
	        area = (diagonalMaior * diagonalMenor) / 2;
	    }

	    public void retornarDiagonalMaior() {
	        System.out.println("A diagonal maior do losango é: " + diagonalMaior);
	    }

	    public void retornarDiagonalMenor() {
	        System.out.println("A diagonal menor do losango é: " + diagonalMenor);
	    }

	    public void retornarArea() {
	        System.out.println("A área do losango é: " + area);
	    }

	    public void listaAtributos() {
	        System.out.println("A diagonal maior do losango é: " + diagonalMaior);
	        System.out.println("A diagonal menor do losango é: " + diagonalMenor);
	        System.out.println("A área do losango é: " + area);
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    }
}
