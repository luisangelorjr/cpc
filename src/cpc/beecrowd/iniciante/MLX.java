package cpc.beecrowd.iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MLX {

	public static void main(String[] args) throws IOException {
		int count = 0;
		int sizeInputs = 6;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		String[] valores = new String[sizeInputs];

		for (int i = 0; i < sizeInputs; i++) {
			valores[i] = in.readLine();
		}

		for (int i = 0; i < valores.length; i++) {
			if (Double.valueOf(valores[i]) > 0.0) {
				count++;
			}
		}

		System.out.printf("%d valores positivos\n", (count));
	}

}
