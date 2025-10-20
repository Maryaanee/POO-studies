package br.edu.principal;
import br.edu.figurasPlanas.*;

public class Principal {

    public static void main(String[] args) {

        // Triângulo
        Triangulo triangulo = new Triangulo();
        triangulo.base = 3;
        triangulo.altura = 4;
        triangulo.calcArea();
        triangulo.listaAtributos();

        // Trapézio
        Trapezio trapezio = new Trapezio();
        trapezio.baseMaior = 5;
        trapezio.baseMenor = 3;
        trapezio.altura = 4;
        trapezio.calcArea();
        trapezio.listaAtributos();

        // Losango
        Losango losango = new Losango();
        losango.diagonalMaior = 6;
        losango.diagonalMenor = 4;
        losango.calcArea();
        losango.listaAtributos();

        // Pentágono
        Pentagono pentagono = new Pentagono();
        pentagono.lado = 4;
        pentagono.apotema = 3;
        pentagono.calcArea();
        pentagono.listaAtributos();

        // Paralelogramo
        Paralelogramo paralelogramo = new Paralelogramo();
        paralelogramo.base = 5;
        paralelogramo.altura = 6;
        paralelogramo.calcArea();
        paralelogramo.listaAtributos();

        // Hexágono
        Hexagono hexagono = new Hexagono();
        hexagono.lado = 3;
        hexagono.calcArea();
        hexagono.listaAtributos();

        // Quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;
        quadrado.calcArea();
        quadrado.listaAtributos();

        // Retângulo
        Retangulo retangulo = new Retangulo();
        retangulo.base = 5;
        retangulo.altura = 7;
        retangulo.calcArea();
        retangulo.listaAtributos();

        // Círculo
        Circulo circulo = new Circulo();
        circulo.raio = 3;
        circulo.calcArea();
        circulo.listaAtributos();
    }
}
