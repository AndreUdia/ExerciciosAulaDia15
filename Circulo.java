public class Circulo {
	double raio;
	double pi = 3.1415;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	double calculaArea() {
		return pi * (raio*raio);
	}
	
	double calculaPerimetro() {
		return 2 * pi * raio;
	}
	
	public String toString() {
		String info = "";
		info += "\nA Area: " + this.calculaArea();
		info += "\nO Perímetro: " + this.calculaPerimetro();
		return info;
	}
}
