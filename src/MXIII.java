import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXIII {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String entrada = in.readLine();

		String[] valores = entrada.trim().split(" ");

		int valorA = Integer.parseInt(valores[0]);
		int valorB = Integer.parseInt(valores[1]);
		int valorC = Integer.parseInt(valores[2]);

		int resultado = valorA;
		if (resultado < valorB) {
			resultado = valorB;
		}

		if (resultado < valorC) {
			resultado = valorC;
		}

		System.out.printf("%s eh o maior\n", (resultado));
	}

}
