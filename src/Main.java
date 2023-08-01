import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String animais = "gato cachorro papagaio cavalo aranha baleia tigre";
		String[] vetorAnimais = animais.split(" ");
		
		for(int i = 0; i < vetorAnimais.length - 1; i++) {
			System.out.println(vetorAnimais[i]);
		};
		
		scan.close();
	}

}
