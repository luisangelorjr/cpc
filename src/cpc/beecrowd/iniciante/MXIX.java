package cpc.beecrowd.iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problema:
 * https://www.beecrowd.com.br/judge/pt/problems/view/1019
 * 
 * Resposta:
 * https://www.beecrowd.com.br/judge/pt/runs/code/29353012
 * 
 * @author luisangelorjr
 *
 */
public class MXIX {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int tempoDeDuracaoEmSegundos = Integer.parseInt(in.readLine());

		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		segundos = tempoDeDuracaoEmSegundos % 60;
		tempoDeDuracaoEmSegundos = tempoDeDuracaoEmSegundos / 60;
		
		minutos = tempoDeDuracaoEmSegundos % 60;
		tempoDeDuracaoEmSegundos = tempoDeDuracaoEmSegundos / 60;
		
		horas = tempoDeDuracaoEmSegundos % 60;
		tempoDeDuracaoEmSegundos = tempoDeDuracaoEmSegundos / 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}
}

