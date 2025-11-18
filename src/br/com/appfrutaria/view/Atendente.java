package br.com.appfrutaria.view;

import java.util.Scanner;


public class Atendente {
	
	Scanner l;
 
 public Atendente() {
	
	 l = new Scanner(System.in);
	 
 }

public int menuPrincipal() {
	
	System.out.println("===Frutaria Legal===");
	System.out.println("1 - cadastrar fruta");
	System.out.println("2 - listar frutas");
	System.out.println("3 - remover fruta");

	int opcaoEscolhida = l.nextInt();
	l.nextLine();

	return opcaoEscolhida;
}

public String cadastrarNomeFruta() {
	
	System.out.println("Digite o nome da fruta: ");
	String nomeFruta = l.nextLine();

	return nomeFruta;
	
}

public double cadastrarPrecoFruta() {
	
	System.out.println("Digite o preço da fruta: ");
	double precoFruta = l.nextDouble();

	return precoFruta;
	
}

public int cadastrarQuantidadeFruta() {
	
	System.out.println("Digite a quantidade da fruta: ");
	int quantidadeFruta = l.nextInt();

	return quantidadeFruta;
	
}



public Scanner getL() {
	return l;
}

public void setL(Scanner l) {
	this.l = l;
}
 
	
	
}
