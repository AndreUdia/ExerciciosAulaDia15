import java.util.Scanner;

public class UsaCirculo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor de raio para o primeiro cálculo");
		double primeiro = in.nextDouble();
		Circulo circ1 = new Circulo(primeiro);
		System.out.println("Digite um valor de raio para o segundo cálculo");
		double segundo = in.nextDouble();
		Circulo circ2 = new Circulo(segundo);
		System.out.println("Digite um valor de raio para o terceiro cálculo");
		double terceiro = in.nextDouble();
		Circulo circ3 = new Circulo(terceiro);
		
		System.out.println("\nDados do primeiro circulo");
		System.out.println(circ1.toString());
		System.out.println("\nDados do segundo circulo");
		System.out.println(circ2.toString());
		System.out.println("\nDados do terceiro circulo");
		System.out.println(circ3.toString());
		
		in.close();

	}

}
