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
				System.out.println("Opci�n no v�lida. Elija una opci�n v�lida.");
			} 
			if(figura != null) {
				System.out.println("El �rea es: " + figura.calcularArea() + " y el per�metro es: " + figura.calcularPerimetro());
			}
		}while(opcion != 0);
	}

	private static void pedirValorLadoCuadrado() {
		System.out.println("Indique el lado del cuadrado: ");
		
	}

	private static void pedirValorApotema() {
		System.out.println("Indique el apotema del pent�gono: ");
		
	}

	private static void pedirValorLadoPentagono() {
		System.out.println("Indique el lado del pent�gono: ");
	}

	private static void pedirValorAlturaRectangulo() {
		System.out.println("Indique la altura del rect�ngulo: ");
		
	}

	private static void pedirValorBaseRectangulo() {
		System.out.println("Indique la base del rect�ngulo: ");
		
	}

	private static void pedirValorAltura() {
		System.out.println("Indique el valor de la altura: ");
		
	}

	private static void pedirValorTercerLadoTriangulo() {
		System.out.println("Indique el valor del tercer lado del tri�ngulo: ");
		
	}

	private static void pedirValorSegundoLadoTriangulo() {
		System.out.println("Indique el valor del segundo lado del tri�ngulo: ");
		
	}

	private static double leerDouble() {
		return scaner.nextDouble();
	}

	private static void pedirValorPrimerLadoTriangulo() {
		System.out.println("Indique el valor del primer lado del tri�ngulo: ");
		
	}

	private static int leerInt() {
		scaner = new Scanner(System.in);
		return scaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.println("Escoja una opci�n.");
		
	}

	private static void escribirMenuPrincipal() {
		System.out.println("FIGURAS GEOM�TRICAS \r\n"
				+ "1. Tri�ngulo \r\n"
				+ "2. Rect�ngulo\r\n"
				+ "3. Cuadrado \r\n"
				+ "4. Pent�gono \r\n"
				+ "0. Salir");
		
	}

}
