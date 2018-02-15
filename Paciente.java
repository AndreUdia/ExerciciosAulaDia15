public class Paciente {
	String nome;
	float peso;
	float altura;
	double calcularIMC() {
		return (peso * altura) / 2;
	}
}
