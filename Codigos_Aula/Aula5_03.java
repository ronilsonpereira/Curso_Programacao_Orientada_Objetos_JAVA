import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	
	public static final double PI = 3.14159; // Palavra final: O valor só pode ser atribuído uma vez. Transforma a variável em uma constante.
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Programa do Slide 11 - Problema exemplo - Versão 1
		// métodos na própria classe do programa

		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();

		double c = circunferencia(raio);
		double v = volume(raio);

		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Valor de PI: %.2f\n", Calculadora.PI);
	}
	
	// Criação dos métodos a partir daqui
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}

	public static double volume(double raio) {

		return 4 * PI * (raio * raio * raio) / 3;

	}
}
