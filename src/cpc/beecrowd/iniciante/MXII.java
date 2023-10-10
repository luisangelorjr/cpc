package cpc.beecrowd.iniciante;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MXII {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String entrada = in.readLine();

		String[] valores = entrada.trim().split(" ");

		double valorA = Double.parseDouble(valores[0]);
		double valorB = Double.parseDouble(valores[1]);
		double valorC = Double.parseDouble(valores[2]);

		processarTriangulo(valorA, valorC);
		processarCirculo(valorC);
		processarTrapezio(valorA, valorB, valorC);
		processarQuadrado(valorB);
		processarRetangulo(valorA, valorB);
	}

	private static void processarTriangulo(double base, double altura) {
		double areaDoTriangulo = base * altura / 2;
		printResultado("TRIANGULO", areaDoTriangulo);
	}

	private static void processarCirculo(double raio) {
		double PI = 3.14159;
		double areaDoCirculo = PI * (Math.pow(raio, 2));
		printResultado("CIRCULO", areaDoCirculo);
	}

	private static void processarTrapezio(double baseA, double baseB, double altura) {
		double areaDoTrapezio = (baseA + baseB) * (altura / 2);
		printResultado("TRAPEZIO", areaDoTrapezio);
	}

	private static void processarQuadrado(double lado) {
		double areaDoQuadrado = lado * lado;
		printResultado("QUADRADO", areaDoQuadrado);
	}

	private static void processarRetangulo(double ladoA, double ladoB) {
		double areaDoRetangulo = ladoA * ladoB;
		printResultado("RETANGULO", areaDoRetangulo);
	}

	public static NumberFormat formatar() {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
		symbols.setDecimalSeparator('.');
		symbols.setGroupingSeparator(',');
		return new DecimalFormat("#0.000", symbols);
	}

	private static void printResultado(String tipoGeometrico, double areaDoTipoGeometrico) {
		StringBuilder sb = new StringBuilder();
		sb.append(tipoGeometrico);
		sb.append(": %s\n");

		NumberFormat formatter = formatar();

		System.out.printf(sb.toString(), formatter.format(areaDoTipoGeometrico));
	}
}
