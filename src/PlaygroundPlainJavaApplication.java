import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlaygroundPlainJavaApplication {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double A = Double.parseDouble(in.readLine());
        double B = Double.parseDouble(in.readLine());
        
        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaDosPesos = pesoA + pesoB;
        
        A = A * pesoA;
        B = B * pesoB;
        
        double somaValores = (A + B);

        double resultado = somaValores / somaDosPesos;
        
        System.out.printf("MEDIA = %.5f\n" , (resultado));

	}

}
