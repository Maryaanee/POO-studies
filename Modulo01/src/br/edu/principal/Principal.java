package br.edu.principal;
import java.util.Scanner;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	RecebeDados.recebeNome();
	double n1 = RecebeDados.recebeNota1();
	double n2 = RecebeDados.recebeNota2();
	double media = Calculos.calcMedia(n1, n2);
	String situacao = Calculos.verificaAprovacao(media);
	Calculos.verificaSituacaoFinal(situacao);		

	}

}
