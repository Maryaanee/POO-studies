package br.edu.principal;
import br.edu.figurasPlanas.*;

public class Principal {

	public static void main(String[] args) {
Triangulo obj1 = new Triangulo();
		
		obj1.base = 3;
		obj1.altura = 4;
		
		obj1.calcArea();
		obj1.retornarArea();
	}

}
