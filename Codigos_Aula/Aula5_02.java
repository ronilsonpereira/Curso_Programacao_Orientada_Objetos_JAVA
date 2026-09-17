
//Nota: Crie a Classe Produto comentada abaixo para poder rodar o Main

// Classe Produto

//public class Produto {
	
	//String nome;
	//double preco;
	//int quantidade;
	
	// Criando Construtor para iniciar o Produto com Nome, Preco e Quantidade
	//public Produto (String nome, double preco, int quantidade)
	//{
	//	this.nome = nome;
		//this.preco = preco;
		//this.quantidade = quantidade;
	//}
	
	// Construtur para Nom e Preço //sobrecarga // O produto não precisa começar com quantidade em estoque. 
	//public Produto (String nome, double preco)
	//{
		//this.nome = nome;
		//this.preco = preco;
	//}
	
	// método para calcular o valor total em estoque
	//public double valorTotalEstoque ()
	//{
	//	return preco * quantidade; 
	//}
	
	// método para adicionar produto
	//public void adicionarProduto(int quantidade)
	//{
		//this.quantidade += quantidade;
	//}
	
	// método para remover produto
	//public void removerProduto (int quantidade) 
	//{
		//this.quantidade -= quantidade;
	//}
	
	// Sobrescrevendo o toString para mostrar: TV, R$ 900.00, 10 unidades, Total: $ 9000.00 
	//public String toString()
	//{
		//return nome + ", R$" + String.format("%.2f", preco)
		//+ ", " + quantidade + " unidades, Total: R$"
		//+ String.format("%.2f", valorTotalEstoque());
		
	//}
//}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Programa Proposta de Melhoria: Slide 28/29 
		//Produto produto = new Produto();
		
		// Obrigando que o Produto comece com Nome e Preço
		
		System.out.println("Insira os dados do Produto:");
		
		System.out.println("Nome: ");
		//produto.nome = sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		//produto.preco = sc.nextDouble();
		double preco = sc.nextDouble();
		
		// 
		//System.out.println("Quantidade: ");
		//produto.quantidade = sc.nextInt();
		//int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println(produto.nome + produto.preco + produto.quantidade);
		
		System.out.println("Dados do Produto: " +produto);
		//System.out.printf("Dados do produto: %s , R$ %.2f, %d unidades, Total: R$ %.2f", produto.nome, produto.preco, produto.quantidade, produto.valorTotalEstoque());
		
		System.out.println("\n Insira a quantidade de produtos a serem adicionados ao estoque:");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println("Dados Atualizados: " + produto);
		
		System.out.println("Insira a quantidade de produtos a serem removidos do estoque:");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.printf("Dados Atualizados: %s ", produto);
	}

}
