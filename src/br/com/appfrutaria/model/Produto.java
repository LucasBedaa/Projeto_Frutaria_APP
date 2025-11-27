package br.com.appfrutaria.model;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

public class Produto {
	
	    protected String nome;
	    protected double preco;
	    protected int quantidade;
	    protected String tipo;

	    protected static int proximoCodigo = 1; 
	    protected int codigoUnico; 
	    
	    public Produto()
	    {
	    	this.nome = " ";
	    	this.preco = 0.0;
	    	this.quantidade = 0;
	    	this.tipo = " ";
	    	this.codigoUnico = proximoCodigo;
	        proximoCodigo++;
	     
	    	
	    }
	    
	    public Produto(String nome, double preco, int quantidade, String tipo) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidade = quantidade;
	        this.tipo = tipo;
	       

	        this.codigoUnico = proximoCodigo;
	        proximoCodigo++;
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public static int getProximoCodigo() {
			return proximoCodigo;
		}

		public static void setProximoCodigo(int proximoCodigo) {
			Produto.proximoCodigo = proximoCodigo;
		}

		public int getCodigoUnico() {
			return codigoUnico;
		}

		public void setCodigoUnico(int codigoUnico) {
			this.codigoUnico = codigoUnico;
		}
	    
	    

	    
}
