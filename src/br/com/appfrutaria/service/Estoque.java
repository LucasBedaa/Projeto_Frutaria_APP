package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.view.Atendente;

public class Estoque {
	
	
	public List<Fruta> listaFruta = new ArrayList<Fruta>();

	public List<Fruta> getListaFruta() {
		return listaFruta;
	}

	public void gerenciadorPrateleira(int opcaoEscolhida, Atendente atendente) {
		
		switch( opcaoEscolhida) {
		
		case 1 -> {
			
			String nomeFruta = atendente.cadastrarNomeFruta();
			double precoFruta = atendente.cadastrarPrecoFruta();
			int quantidadeFruta = atendente.cadastrarQuantidadeFruta();
			
			Fruta fruta = new Fruta(nomeFruta, precoFruta, quantidadeFruta);
			listaFruta.add(fruta);
		}
		}
		
	}
	
	
	

	
}
