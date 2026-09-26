/*
 O código fornecido está todo dentro da classe Main, mas para rodar corretamente no Eclipse
 é necessário organizar o projeto da seguinte forma:

	-Criar um novo projeto Java no Eclipse.

	- Criar a classe Main e colar nela o código principal (aquele que contém o método main).

	- Criar a classe Calculadora separadamente, conforme o trecho comentado no código.

	- Essa classe deve conter:

		- A constante PI

		- O método circunferencia(double raio)

		- O método volume(double raio)
*/

// Exemplo da classe Calculadora:

//public class Calculadora {

//	public static final double PI = 3.14159; // Palavra final: O valor só pode ser atribuído uma vez. Transforma a variável em uma constante.

	//public static double circunferencia(double raio) {
	//	return 2 * PI * raio;
	//}

	//public static double volume(double raio) {

//		return 4 * PI * (raio * raio * raio) / 3;

	//}

//}

// Depois disso, basta executar a classe Main normalmente no Eclipse.

// Programa do Slide 15 - Problema exemplo - Versão 3

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		Calculadora calc = new Calculadora();

		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();

		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);

		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Valor de PI: %.2f\n", Calculadora.PI);
	}
}
