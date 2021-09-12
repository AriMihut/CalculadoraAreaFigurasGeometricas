package figura;

public class Cuadrado extends Rectangulo{

	private static double altura;
	private static double base;
	private double lado;

	public Cuadrado(double lado) {
		super(base, altura);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
}
