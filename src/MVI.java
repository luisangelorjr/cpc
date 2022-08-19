

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MVI {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		double A = Double.parseDouble(in.readLine());
		double B = Double.parseDouble(in.readLine());
		double C = Double.parseDouble(in.readLine());

		double pesoA = 2.0;
		double pesoB = 3.0;
		double pesoC = 5.0;
		double somaDosPesos = pesoA + pesoB + pesoC;

		A = A * pesoA;
		B = B * pesoB;
		C = C * pesoC;

		double somaValores = (A + B + C);

		double resultado = somaValores / somaDosPesos;

		System.out.printf("%.4f\n", (resultado));
	}
}
