import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MMMCDXXXII {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String entrada = in.readLine();

		String valores = entrada.trim();

		if(valores.contains("9")) {
			System.out.printf("F\n");
		} else {
			System.out.printf("S\n");
		}
		
	}
}
