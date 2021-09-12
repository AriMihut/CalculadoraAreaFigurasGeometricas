package figura;

public class Pentagono extends FiguraGeometrica{

	private double lado;
	private double apotema;
	
	public Pentagono(double lado, double apotema) {
		super();
		this.lado = lado;
		this.apotema = apotema;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	@Override
	public double calcularArea() {
		return (apotema*lado)/2;
	}

	@Override
	public double calcularPerimetro() {
		return lado*5;
	}
	
	@Override
	public String toString() {
		return "Pentagono [lado=" + lado + ", apotema=" + apotema + "]";
	}

}
