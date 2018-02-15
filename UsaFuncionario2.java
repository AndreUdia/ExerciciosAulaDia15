import java.util.Scanner;

public class UsaFuncionario2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		String[] nomes = new String[3];
		double [] horas = new double[3];
		double [] valor = new double[3];
				
		for(int i=0; i<3;i++) {
			System.out.println("Digite o nome do " + (i+1) +"º : ");
			nomes[i] = in.next();
			System.out.println("Digite a quantidade de horas do " + (i+1) +"º : ");
			horas[i] = in.nextDouble();
			System.out.println("Digite o valor da hora do " + (i+1) +"º : ");
			valor[i] = in.nextDouble();
		}
		
		Funcionario func1 = new Funcionario(nomes[0],horas[0], valor[0]);
		System.out.println(func1.toString());
		
		Funcionario func2 = new Funcionario(nomes[1],horas[1], valor[1]);
		System.out.println(func2.toString());
		
		Funcionario func3 = new Funcionario(nomes[2],horas[2], valor[2]);
		System.out.println(func3.toString());
	}

}
