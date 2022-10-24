package Aula5;

public class Retangulo {
	private double comprimento;
	private double altura;

	Retangulo(double comprimento, double altura) {
		setRetangulo(comprimento, altura);
	}

	public double perimetro() {
		return comprimento*2 + altura*2;
	}

	public double area() {
		return comprimento * altura;
	}

	public String toString() {
		return "Retangulo com lados: " + this.comprimento + " : " + this.altura;
	}

	public boolean equals(Retangulo b) {
		return this.comprimento == b.getComprimento()  && this.altura ==  b.getAltura();
	}

	public double getComprimento() {
		return this.comprimento;
	}

	public double getAltura() {
		return this.altura;
	}



	public void setRetangulo(double comprimento, double altura) {
		assert comprimento > 0 && altura > 0;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
}