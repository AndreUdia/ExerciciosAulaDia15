public class Funcionario {
	String nome;
	double horasTrabalhadas;
	double valorHoras;
	
	Funcionario (String nome, double horas, double valor){
		this.nome = nome;
		this.horasTrabalhadas = horas;
		this.valorHoras = valor;
	}
	
	double calcularSalario() {
		return horasTrabalhadas * valorHoras;
	}
	
	public String toString() {
		String info = "";
		info += "\nO sal�rio do funcion�rio " + this.nome + " �: R$" + this.calcularSalario();
		return info;
	}
}
