package cpc.beecrowd.iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXIV {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int distanciaTotalPercorrida = Integer.parseInt(in.readLine());
		double totalCombustivelGastoEmLitros = Double.parseDouble(in.readLine());
		
		double resultado = distanciaTotalPercorrida / totalCombustivelGastoEmLitros;

		System.out.printf("%.3f km/l\n", (resultado));
	}

}
