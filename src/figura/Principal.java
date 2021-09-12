package figura;

import java.util.Scanner;

public class Principal {
	
	private static int opcion;
	static Scanner scaner;
	private static FiguraGeometrica figura;

	public static void main(String[] args) {
		
		do {
			escribirMenuPrincipal();
			pedirOpcion();
			opcion = leerInt();
			switch(opcion) {
			case 1:
					pedirValorPrimerLadoTriangulo();
					double valor1 = leerDouble();
					pedirValorSegundoLadoTriangulo();
					double valor2 = leerDouble();
					pedirValorTercerLadoTriangulo();
					double valor3 = leerDouble();
					pedirValorAltura();
					double alturaTriangulo = leerDouble();
					figura = new Triangulo(valor1,valor2,valor3,alturaTriangulo);
					break;
			case 2:
				pedirValorBaseRectangulo();
				double baseRectangulo = leerDouble();
				pedirValorAlturaRectangulo();
				double alturaRectangulo = leerDouble();
				figura = new Rectangulo(baseRectangulo,alturaRectangulo);
				break;
			case 3:
				pedirValorLadoCuadrado();
				double ladoCuadrado = leerDouble();
				figura = new Cuadrado(ladoCuadrado);
				break;
			case 4:
				pedirValorLadoPentagono();
				double ladoPentagono = leerDouble();
				pedirValorApotema();
				double apotema = leerDouble();
				figura = new Pentagono(ladoPentagono,apotema);
				break;
			default:
				System.out.println("Opción no válida. Elija una opción válida.");
			} 
			if(figura != null) {
				System.out.println("El área es: " + figura.calcularArea() + " y el perímetro es: " + figura.calcularPerimetro());
			}
		}while(opcion != 0);
	}

	private static void pedirValorLadoCuadrado() {
		System.out.println("Indique el lado del cuadrado: ");
		
	}

	private static void pedirValorApotema() {
		System.out.println("Indique el apotema del pentágono: ");
		
	}

	private static void pedirValorLadoPentagono() {
		System.out.println("Indique el lado del pentágono: ");
	}

	private static void pedirValorAlturaRectangulo() {
		System.out.println("Indique la altura del rectángulo: ");
		
	}

	private static void pedirValorBaseRectangulo() {
		System.out.println("Indique la base del rectángulo: ");
		
	}

	private static void pedirValorAltura() {
		System.out.println("Indique el valor de la altura: ");
		
	}

	private static void pedirValorTercerLadoTriangulo() {
		System.out.println("Indique el valor del tercer lado del triángulo: ");
		
	}

	private static void pedirValorSegundoLadoTriangulo() {
		System.out.println("Indique el valor del segundo lado del triángulo: ");
		
	}

	private static double leerDouble() {
		return scaner.nextDouble();
	}

	private static void pedirValorPrimerLadoTriangulo() {
		System.out.println("Indique el valor del primer lado del triángulo: ");
		
	}

	private static int leerInt() {
		scaner = new Scanner(System.in);
		return scaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.println("Escoja una opción.");
		
	}

	private static void escribirMenuPrincipal() {
		System.out.println("FIGURAS GEOMÉTRICAS \r\n"
				+ "1. Triángulo \r\n"
				+ "2. Rectángulo\r\n"
				+ "3. Cuadrado \r\n"
				+ "4. Pentágono \r\n"
				+ "0. Salir");
		
	}

}
