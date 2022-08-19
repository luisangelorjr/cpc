import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXV {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String plano1 = in.readLine();
		String plano2 = in.readLine();

		String[] valoresPlano1 = plano1.trim().split(" ");
		String[] valoresPlano2 = plano2.trim().split(" ");

		double valorX1 = Double.parseDouble(valoresPlano1[0]);
		double valorX2 = Double.parseDouble(valoresPlano2[0]);
		double valorY1 = Double.parseDouble(valoresPlano1[1]);
		double valorY2 = Double.parseDouble(valoresPlano2[1]);

		double resultado = Math.sqrt(Math.pow((valorX2 - valorX1), 2) + Math.pow((valorY2 - valorY1), 2));

		System.out.printf("%.4f\n", (resultado));
	}

}
