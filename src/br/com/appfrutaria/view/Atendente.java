package br.com.appfrutaria.view;

import java.util.Scanner;
import br.com.appfrutaria.model.Produto;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

public class Atendente {

    Scanner leia;

    public Atendente() {
        leia = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("========================");
        System.out.println("|         Menu         |");
        System.out.println("========================");
        System.out.println("|1 - Cadastrar fruta   |");
        System.out.println("|2 - Cadastrar verdura |");
        System.out.println("|3 - Listar frutas     |");
        System.out.println("|4 - Listar verdura    |");
        System.out.println("|5 - Remover fruta     |");
        System.out.println("|6 - Remover verdura   |");
        System.out.println("|7 - Buscar fruta      |");
        System.out.println("|8 - Buscar verdura    |");
        System.out.println("|9 - Total de frutas   |");
        System.out.println("|10- Total de verduras |");
        System.out.println("|0 - Sair              |");
        System.out.println("========================");
        int opcao = leia.nextInt();
        leia.nextLine();
        return opcao;
    }

    public String frutaNome() {
        System.out.print("Nome da fruta: ");
        return leia.nextLine();
    }
    
    public String verduraNome() {
    	System.out.println("Nome da verdura: ");
    	return leia.nextLine();
    }

    public double frutaPreco() {
        System.out.print("Preço: ");
        return leia.nextDouble();
    }
    
    public double verduraPreco() {
    	System.out.println("Preço: ");
    	return leia.nextDouble();
    }

    public int frutaQuantidade() {
        System.out.print("Quantidade: ");
        return leia.nextInt();
    }
    
    public int verduraQuantidade() {
    	System.out.println("Quantidade: ");
    	return leia.nextInt();
    }

    public String frutaTipo() {
        leia.nextLine();
        System.out.print("Tipo: ");
        return leia.nextLine();
    }
    public String verduraTipo() {
    	leia.nextLine();
    	System.out.println("Tipo: ");
    	return leia.nextLine();
    }

    public void visualizar(Fruta fruta) {
        System.out.println("========================");
        System.out.println("|Código: " + fruta.getCodigoUnico() );
        System.out.println("|Nome: " + fruta.getNome());
        System.out.println("|Preço: " + fruta.getPreco());
        System.out.println("|Quantidade: " + fruta.getQuantidade());
        System.out.println("|Tipo: " + fruta.getTipo());
        System.out.println("========================\n");

    }
    public void visualizar(Verdura verdura) {
        System.out.println("========================");
        System.out.println("|Código: " + verdura.getCodigoUnico() );
        System.out.println("|Nome: " + verdura.getNome());
        System.out.println("|Preço: " + verdura.getPreco());
        System.out.println("|Quantidade: " + verdura.getQuantidade());
        System.out.println("|Tipo: " + verdura.getTipo());
        System.out.println("========================\n");

    }

    public String frutaRemover() {
        System.out.print("Nome da fruta para remover: ");
        return leia.nextLine();
    }
    public String verduraRemover() {
        System.out.print("Nome da verdura para remover: ");
        return leia.nextLine();
    }

    public void visualizarFrutaRemovida(String nome) {
        System.out.println("Fruta '" + nome + "' removida.");
    }
    
    public void visualizarVerduraRemovida(String nome) {
        System.out.println("Verdura '" + nome + "' removida.");
    }

    public void visualizarFrutaAtualizada(String nome) {
        System.out.println("A fruta '" + nome + "' já existia. Atributos atualizados.");
    }
    
    public void visualizarVerduraAtualizada(String nome) {
        System.out.println("A verdura '" + nome + "' já existia. Atributos atualizados.");
    }

    public void visualizarFrutaNova(String nome) {
        System.out.println("Fruta '" + nome + "' cadastrada com sucesso!");
    }
    
    public void visualizarVerduraNova(String nome) {
        System.out.println("Verdura '" + nome + "' cadastrada com sucesso!");
    }
    
    public String mensagemBuscarFruta() {
		System.out.println("Informe a fruta que deseja buscar: ");
		return leia.nextLine();
	}
    
    public String mensagemBuscarVerdura() {
		System.out.println("Informe a verdura que deseja buscar: ");
		return leia.nextLine();
	}
    
	public void mensagemFrutaEncontrada(String marca) {
		System.out.println("Fruta '" + marca + "' foi encontrada.");
	}
	
	public void mensagemVerduraEncontrada(String marca) {
		System.out.println("Verdura '" + marca + "' foi encontrada.");
	}


    public void menssagemFrutaNaoEncontrado(String nome) {
        System.out.println("Fruta '" + nome + "' não encontrada!");
    }
    
    public void menssagemVerduraNaoEncontrado(String nome) {
        System.out.println("Verdura '" + nome + "' não encontrada!");
    }
    
    public void mensagemTotalFrutas(Integer total) {
    	System.out.println("O total de frutas é "+ total);
    }
    
    public void mensagemTotalVerduras(Integer total) {
    	System.out.println("O total de verduras é "+ total);
    }


    public void finalizarApp() {
        System.out.println("Sistema encerrado.");
    }
}
