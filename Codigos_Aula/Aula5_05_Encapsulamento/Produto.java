
//Nota: Crie esse Classe Produto e retire para poder rodar o Main

// Classe Produto

public class Produto {
	
	// Encapsulamento, tudo private:
	private String nome;
	private double preco;
	private int quantidade;
	
	// Criando Construtor para iniciar o Produto com Nome, Preco e Quantidade
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtur para Nome e Preço //sobrecarga // O produto não precisa começar com
	// quantidade em estoque.
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	//criando do método get para mostrar o nome do produto atualizado
	public String getNome(){
		return nome;
	}
	//criando do método set para poder alterar o nome do produto
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	//criando do método get para mostrar o preço do produto atualizado
	public double getPreco(){
		return preco;
	}
	
	//criando do método set para poder alterar o preço do produto
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	// A quantidade do produto só pode ser alterada quando houver uma entrada ou saida no estoque.
			// Só fazer o método getQuantidade, pois não podemos alterar a qtd do produto.
			
			public int getQuantidade ()
			{
				return quantidade;
			}
	
	
	
	

	// método para calcular o valor total em estoque
	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	// método para adicionar produto
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	// método para remover produto
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	// Sobrescrevendo o toString para mostrar: TV, R$ 900.00, 10 unidades, Total: $
	// 9000.00
	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$"
				+ String.format("%.2f", valorTotalEstoque());

	}
}
