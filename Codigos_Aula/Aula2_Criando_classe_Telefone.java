import java.util.Locale;
import java.util.Scanner;

//Nota: Crie a classe Telefone, com seus atributos, em seguido, vá para o Main realizar as operações 

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Iphone 16, 6.1 128gb, IOS
		
		// Galaxy s25, 6.9, 256gb, Android
		
		Telefone telefoneA = new Telefone();
		// Crie o telefoneB
		
		telefoneA.nome = "Iphone 16";
		telefoneA.memoria = 128;
		telefoneA.tamanhoTela = 6.1;
		telefoneA.SO = "IOS";
		
		System.out.println("Dados do telefone A:");
		System.out.printf("O celular  possui memória de %d com tela de %f e sistema %s", telefoneA.nome, telefoneA.memoria, telefoneA.tamanhoTela, telefoneA.SO);
			

	}

}


// Nota: Crie a classe Telefone abaixo:


//public class Telefone {
	
//	public String nome;
//	public int memoria;
//	public double tamanhoTela;
//	public String SO;
//}

