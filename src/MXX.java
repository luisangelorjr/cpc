import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problema:
 * https://www.beecrowd.com.br/judge/pt/problems/view/1020
 * 
 * Resposta:
 * https://www.beecrowd.com.br/judge/pt/runs/code/29459251
 * 
 * @author luisangelorjr
 *
 */

public class MXX {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int idadeEmDias = Integer.parseInt(in.readLine());
		
		int anos = 0;
		int meses = 0;
		int dias = 0;
		
		anos = idadeEmDias / 365;
		idadeEmDias = idadeEmDias % 365;
		
		meses = idadeEmDias / 30;
		idadeEmDias = idadeEmDias % 30;
		
		dias = idadeEmDias;

		System.out.printf("%d ano(s)\n", (anos));
		System.out.printf("%d mes(es)\n", (meses));
		System.out.printf("%d dia(s)\n", (dias));
	}

}
