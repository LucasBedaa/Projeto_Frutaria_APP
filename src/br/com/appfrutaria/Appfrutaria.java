package br.com.appfrutaria;

import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.service.Estoque;

public class Appfrutaria {
	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Estoque prateleira = new Estoque();
		int opcaoMenuEscolha = 1;

		do {
			opcaoMenuEscolha = atendente.menuPrincipal();
			prateleira.gerenciarPrateleira(opcaoMenuEscolha, atendente);
		} while (opcaoMenuEscolha != 0);

		atendente.finalizarApp();
	}
}