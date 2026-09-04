
import java.util.Locale;
import java.util.Scanner;

// nota: Crie um projeto chamado Aula2, depois crie uma classe Main para rodar esse programa
public class Main { 

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Programa Slide 26
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta=R$%.2f%n", conta);

	}

}
