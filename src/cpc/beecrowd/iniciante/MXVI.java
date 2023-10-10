package cpc.beecrowd.iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXVI {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		double distanciaEmKMInformada = Double.parseDouble(in.readLine());
		int velocidadeCarroXEmKmHora = 60;
		int velocidadeCarroYEmKmHora = 90;

		double minutosNumaHora = 60.0;

		double velocidadeCarroXEmKmMinuto = velocidadeCarroXEmKmHora / minutosNumaHora;
		double velocidadeCarroYEmKmMinuto = velocidadeCarroYEmKmHora / minutosNumaHora;

		int minutos = 0;
		double distanciaEmKMCalculada = 0;

		while (distanciaEmKMCalculada != distanciaEmKMInformada) {
			minutos++;
			distanciaEmKMCalculada = (velocidadeCarroYEmKmMinuto * minutos) - (velocidadeCarroXEmKmMinuto * minutos);
		}

		System.out.printf("%d minutos\n", (minutos)); 
	}

}
