import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Programa Proposta de Melhoria: Slide 28/29
		// Produto produto = new Produto();

		// Obrigando que o Produto comece com Nome e Preço

		System.out.println("Insira os dados do Produto:");

		System.out.println("Nome: ");
		// produto.nome = sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		// produto.preco = sc.nextDouble();
		double preco = sc.nextDouble();

		// System.out.println("Quantidade: ");
		// produto.quantidade = sc.nextInt();
		// int quantidade = sc.nextInt();

		Produto produto = new Produto(nome, preco);
		
		// Alterando o nome do Produto
		produto.setNome("Computador"); 
		
		// Imprimindo apenas o nome do Produto atualizado
		System.out.println("Nome do produto atualizado: " + produto.getNome());
		
		//Alterando o Preço do Produto
		
		produto.setPreco(1300);
		
		System.out.println("Preço do Produto atualizado:" + produto.getPreco());
		
		


		

		//produto.setPreco(1200);
		//System.out.println("Preço atualizado: " + produto.getPreco());

		//System.out.println("Produto atualizado: " + produto.getNome());

		System.out.println("Dados do produto: " + produto);

		//System.out.println(produto.getNome() + produto.getPreco() + produto.quantidade);

		System.out.println("Dados do Produto: " + produto);
		// System.out.printf("Dados do produto: %s , R$ %.2f, %d unidades, Total: R$
		// %.2f", produto.nome, produto.preco, produto.quantidade,
		// produto.valorTotalEstoque());

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
