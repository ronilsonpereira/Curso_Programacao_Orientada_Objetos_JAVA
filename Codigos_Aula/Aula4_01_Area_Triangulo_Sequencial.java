import java.util.Locale; // Importa a classe Locale para definir o padrão de localização
import java.util.Scanner; //Importa a classe Scanner para entrada de dados

//NOTA: Crie o Projeto Aula 4 no Eclipse e crie a classe Main para poder rodar os Programas abaixo

public class Main {

	public static void main(String[] args) {

		// Define o padrão de localização para US (ponto decimal ao invés de vírgula)
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para capturar entrada do usuário
		Scanner sc = new Scanner(System.in);
		
		// PROGRAMA DO SLIDE 12 

		// Declaração de variáveis para armazenar os lados dos triângulos X e Y
		double xA, xB, xC, yA, yB, yC;

		// Solicita ao usuário que insira as medidas do triângulo X
		System.out.println("Digite as medidas do Triangulo X");  // Opcional
		System.out.println("Lado A do Triangulo X (ex: 3.22):"); // Opcional
		xA = sc.nextDouble();
		System.out.println("Lado B do Triangulo X (ex: 3.22):"); // Opcional
		xB = sc.nextDouble();
		System.out.println("Lado C do Triangulo X (ex: 3.22):"); // Opcional
		xC = sc.nextDouble();

		// Solicita ao usuário que insira as medidas do triângulo Y
		System.out.println("Digite as medidas do triangulo Y"); // Opcional
		System.out.println("Lado A do Triangulo Y (ex: 3.22):"); // Opcional
		yA = sc.nextDouble();
		System.out.println("Lado B do Triangulo Y (ex: 3.22):"); // Opcional
		yB = sc.nextDouble();
		System.out.println("Lado C do Triangulo Y (ex: 3.22):"); // Opcional
		yC = sc.nextDouble();

		// Calcula o semi-perímetro do triângulo X
		double p = (xA + xB + xC) / 2.0;
		// Aplica a fórmula de Heron para calcular a área do triângulo X
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Calcula o semi-perímetro do triângulo Y
		p = (yA + yB + yC) / 2.0;
		// Aplica a fórmula de Heron para calcular a área do triângulo Y
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		// Exibe os valores das áreas dos triângulos X e Y formatados com duas casas
		// decimais
		System.out.format("\nO valor da área do triangulo X é: %.2f", areaX);
		System.out.format("\nO valor da área do triangulo Y é: %.2f ", areaY);
		
		if (areaX > areaY)
		
			System.out.println("\n Área maior: X");
		
		else
			System.out.println("\n Área maior: Y");

		// Fecha o Scanner para evitar vazamento de recursos
		sc.close();

		// Programa Slide 07

		// int n;

		// n =sc.nextInt();
		// int soma = 0;

		// for (int i = 0; i < n; i++)
		// {
		// int x = sc.nextInt();
		// soma = soma + x;
		// }

		// System.out.println(soma);

		// Programa do Slide 03

		// int x;
		// x = sc.nextInt();
		// int soma = 0;
		// while (x != 0)
		// {
		// soma = soma + x;
		// x = sc.nextInt();
		// }

		// System.out.println(soma);

	}

}
