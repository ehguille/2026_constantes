package constantes;

public final class Calculadora {
	
	public static final double PI=3.1415926535;
	
	private Calculadora() {	}
	
	public static int sumar(int a, int b) {
		return a+b;
	}
	
	public static double calcularAreaCirculo(double r) {
		return 2*PI*r;
	}
	
}
