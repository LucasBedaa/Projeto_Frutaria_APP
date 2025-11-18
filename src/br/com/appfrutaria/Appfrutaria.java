package br.com.appfrutaria;

import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.service.Estoque;

public class Appfrutaria {
	
	public static void main (String[] args) {
	
		Atendente atendente = new Atendente();
		int opcaoEscolhida = atendente.menuPrincipal();
		Estoque estoque = new Estoque();
		
		do {
			
			estoque.gerenciadorPrateleira(opcaoEscolhida, atendente);
			
		}while(opcaoEscolhida != 0);
		
		
	}
	
}
