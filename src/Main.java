import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int y = 0;
		int x = 1;
		
		while(x > 0) {
			System.out.println("Digite um número para somar ou 0 para finalizar: ");
			x = scan.nextInt();
			y = y + x;
		};
		System.out.println("Valor Total: " + y);
		scan.close();
	}

}
