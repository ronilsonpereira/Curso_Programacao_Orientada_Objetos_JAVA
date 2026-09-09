import java.util.Locale;
import java.util.Scanner;

public class Main {

	// NOTA: No Projeto Aula 4, rode o Programa na classe Main, entretanto, crie a classe Triangulo para poder rodar
	public static void main(String[] args) {

		// Define o padrão de localização para US (ponto decimal ao invés de vírgula)
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para capturar entrada do usuário
		Scanner sc = new Scanner(System.in);

		// PROGRAMA DO SLIDE

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		// Solicita ao usuário que insira as medidas do triângulo X
		System.out.println("Digite as medidas do Triangulo X"); // Opcional
		System.out.println("Lado A do Triangulo X (ex: 3.22):"); // Opcional
		x.a = sc.nextDouble();
		System.out.println("Lado B do Triangulo X (ex: 3.22):"); // Opcional
		x.b = sc.nextDouble();
		System.out.println("Lado C do Triangulo X (ex: 3.22):"); // Opcional
		x.c = sc.nextDouble();

		// Solicita ao usuário que insira as medidas do triângulo Y
		System.out.println("Digite as medidas do triangulo Y"); // Opcional
		System.out.println("Lado A do Triangulo Y (ex: 3.22):"); // Opcional
		y.a = sc.nextDouble();
		System.out.println("Lado B do Triangulo Y (ex: 3.22):"); // Opcional
		y.b = sc.nextDouble();
		System.out.println("Lado C do Triangulo Y (ex: 3.22):"); // Opcional
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

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

	}

}


// Crie a classe abaixo fora do Main

//Classe Triangulo

//public class Triangulo {

	//public double a;
	//public double b;
	//public double c;

	// criação do método / função para calcular area.

	//public double area() {
		//double p = (a + b + c) / 2.0;

		//return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	//}
//}
