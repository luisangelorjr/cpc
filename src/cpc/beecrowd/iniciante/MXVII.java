package cpc.beecrowd.iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXVII {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		double tempoGastoNaViagemEmHoras = Double.parseDouble(in.readLine());
		double velocidadeMediaKmPorHora = Double.parseDouble(in.readLine());

		double distanciaPercorrida = tempoGastoNaViagemEmHoras * velocidadeMediaKmPorHora;

		double litrosGastosPorKM = 12.0;

		double quantidadeLitrosNecessario = distanciaPercorrida / litrosGastosPorKM;

		System.out.printf("%.3f\n", quantidadeLitrosNecessario);
	}
}
