import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXVIII {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int valorLido = Integer.parseInt(in.readLine());

		int notasDeCem;
		int notasDeCinquenta;
		int notasDeVinte;
		int notasDeDez;
		int notasDeCinco;
		int notasDeDois = 0;
		int notasDeUm = 0;

		int saldo;

		notasDeCem = valorLido / 100;
		saldo = valorLido - (notasDeCem * 100);

		notasDeCinquenta = saldo / 50;
		saldo = saldo - (notasDeCinquenta * 50);

		notasDeVinte = saldo / 20;
		saldo = saldo - (notasDeVinte * 20);

		notasDeDez = saldo / 10;
		saldo = saldo - (notasDeDez * 10);

		notasDeCinco = saldo / 5;
		saldo = saldo - (notasDeCinco * 5);

		if (saldo >= 2) {
			notasDeDois = saldo / 2;
			saldo = saldo - (notasDeDois * 2);
		}

		if (saldo >= 1) {
			notasDeUm = saldo / 1;
			saldo = saldo - (notasDeUm * 1);
		}

		System.out.printf("%d\n", valorLido);
		System.out.printf("%d nota(s) de R$ 100,00\n", notasDeCem);
		System.out.printf("%d nota(s) de R$ 50,00\n", notasDeCinquenta);
		System.out.printf("%d nota(s) de R$ 20,00\n", notasDeVinte);
		System.out.printf("%d nota(s) de R$ 10,00\n", notasDeDez);
		System.out.printf("%d nota(s) de R$ 5,00\n", notasDeCinco);
		System.out.printf("%d nota(s) de R$ 2,00\n", notasDeDois);
		System.out.printf("%d nota(s) de R$ 1,00\n", notasDeUm);
	}
}
