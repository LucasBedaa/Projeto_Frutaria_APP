package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appfrutaria.model.*;
import br.com.appfrutaria.view.Atendente;

public class Estoque {

	List<Fruta> listaFruta;
	List<Verdura> listaVerdura;
	private char[] total;

	public Estoque() {
		listaFruta = new ArrayList<>();
		listaVerdura = new ArrayList<>();
	}

	public void gerenciarPrateleira(int opcao, Atendente atendente) {

		switch (opcao) {

		case 1 -> {
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			String tipo = atendente.frutaTipo();

			boolean encontrada = false;
			for (Fruta fruta : listaFruta) {
				if (fruta.getNome().equalsIgnoreCase(nome)) {

					fruta.setPreco(preco);
					fruta.setQuantidade(quantidade);
					fruta.setTipo(tipo);

					atendente.visualizarFrutaAtualizada(nome);
					encontrada = true;
					break;
				}
			}

			if (!encontrada) {
				Fruta nova = new Fruta(nome, preco, quantidade, tipo);
				listaFruta.add(nova);
				atendente.visualizarFrutaNova(nome);
			}
		}

		case 2 -> {
			String nome = atendente.verduraNome();
			double preco = atendente.verduraPreco();
			int quantidade = atendente.verduraQuantidade();
			String tipo = atendente.verduraTipo();

			boolean encontrada = false;
			for (Verdura verdura : listaVerdura) {
				if (verdura.getNome().equalsIgnoreCase(nome)) {

					verdura.setPreco(preco);
					verdura.setQuantidade(quantidade);
					verdura.setTipo(tipo);

					atendente.visualizarFrutaAtualizada(nome);
					encontrada = true;
					break;
				}
			}

			if (!encontrada) {
				Verdura nova = new Verdura(nome, preco, quantidade, tipo, quantidade);
				listaVerdura.add(nova);
				atendente.visualizarFrutaNova(nome);
			}
		}

		case 3 -> {
			for (Fruta fruta : listaFruta) {
				atendente.visualizar(fruta);
			}
		}
		case 4 -> {
			for (Verdura verdura : listaVerdura) {
				atendente.visualizar(verdura);
			}
		}

		case 5 -> {
			String nome = atendente.frutaRemover();
			boolean removida = false;

			for (int i = 0; i < listaFruta.size(); i++) {
				if (listaFruta.get(i).getNome().equalsIgnoreCase(nome)) {
					listaFruta.remove(i);
					removida = true;
					break;
				}
			}

			if (removida)
				atendente.visualizarFrutaRemovida(nome);
			else
				atendente.menssagemFrutaNaoEncontrado(nome);
		}

		case 6 -> {
			String nome = atendente.verduraRemover();
			boolean removida = false;

			for (int i = 0; i < listaVerdura.size(); i++) {
				if (listaVerdura.get(i).getNome().equalsIgnoreCase(nome)) {
					listaVerdura.remove(i);
					removida = true;
					break;
				}
			}

			if (removida)
				atendente.visualizarVerduraAtualizada(nome);
			else
				atendente.menssagemVerduraNaoEncontrado(nome);
		}
		case 7 -> {
			String marca = atendente.mensagemBuscarFruta();
			boolean encontrada = false;

			for (Fruta fruta : listaFruta) {
				if (fruta.getNome().equalsIgnoreCase(marca)) {
					atendente.mensagemFrutaEncontrada(marca);
					encontrada = true;
				}
			}

			if (!encontrada) {
				atendente.menssagemFrutaNaoEncontrado(marca);
			}
		}
		case 8 -> {
			String marca = atendente.mensagemBuscarVerdura();
			boolean encontrada = false;

			for (Verdura verdura : listaVerdura) {
				if (verdura.getNome().equalsIgnoreCase(marca)) {
					atendente.mensagemVerduraEncontrada(marca);
					encontrada = true;
				}
			}

			if (!encontrada) {
				atendente.menssagemVerduraNaoEncontrado(marca);
			}
		}

		case 9 -> {
			int total = 0;
			for(Fruta fruta : listaFruta) {
				total += fruta.getQuantidade();
			}
			atendente.mensagemTotalFrutas(total);
		}
		case 10 -> {
			int total = 0;
			for(Verdura verdura : listaVerdura) {
				total += verdura.getQuantidade();
			}
			atendente.mensagemTotalVerduras(total);
		}
		}
	}
}
