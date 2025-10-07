package br.edu.figsplanas;

public class Triangulo {
	//Atributos
	public double base;
	public double altura;
	public double area;
	
	//Métodos 
	public void calcArea() {
		area = (base * altura)/2;
		System.out.println("Área: " + area);}
	}

