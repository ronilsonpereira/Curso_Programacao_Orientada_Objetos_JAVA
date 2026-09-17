

// Coloque o código da Classe Peoduto abaixo na Classe Produto e deixe apenas o Main para rodar o Programa
// Classe Produto
public class Produto {

	// Atributos de Produto
	
	public String nome;
	public double preco;
	public int quantidade;
	
	// método para calcular o valor total em estoque
	
	public double valorTotalEmEstoque()
	{
		return preco * quantidade;
	}
	
	// método para adicionar produto
	
	public void adicionarProduto(int quantidade)
	{
		// como diferenciar atributo da classe do método?
		
		this.quantidade += quantidade;
	}
	
	// método para remover produto
	
	public void removerProduto(int quantidade)
	{
		this.quantidade -= quantidade;
	}
	
	public String toString() //TV, R$ 900.00, 10 unidades, Total: $ 9000.00 
	{
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco) 
			+ ", "
			+ quantidade
			+ " unidades, Total: R$ "
			+ String.format("%.2f", valorTotalEmEstoque());
	}
}


// Classe Main

import java.util.Locale;
import java.util.Scanner;

// Programa do Slide 4
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criando e instanciando o objeto.
		
		Produto produto = new Produto();
		
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		
		//System.out.println(produto.nome + ", R$ " + produto.preco + ", " + produto.quantidade);
		//System.out.format("O produto %s, com preço de R$ %.2f e quantidade %d",produto.nome, produto.preco, produto.quantidade);
		
		System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		
		System.out.print("Insira a quantidade de produtos a serem removidos ao estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);
		
	}

}


