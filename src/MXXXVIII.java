import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXXXVIII {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String entrada = in.readLine();

		String[] valores = entrada.trim().split(" ");

		int codigo = Integer.valueOf(valores[0]);
		int quantidade = Integer.valueOf(valores[1]);
		
		double total = quantidade * getValor(codigo);

		System.out.printf("Total: R$ %.2f\n", total);

	}
	
	private static double getValor(int codigo) {
		switch (codigo) {
			case 1:
				return 4.00;
			case 2:
				return 4.50;
			case 3:
				return 5.00;
			case 4:
				return 2.00;
			case 5:
				return 1.50;
		}
		return 0.0;
	}
}
