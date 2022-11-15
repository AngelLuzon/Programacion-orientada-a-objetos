package pruebaTeclado;
import entrada.Teclado;
public class pruebaTeclado {

	public static void main(String[] args) {
		
//		int entero = Teclado.leerEntero("Introduce un número entero:");
//		System.out.println("Entero: " + entero);
		
//		int natural = Teclado.leerNatural("Introduce un número natural: ");
//		System.out.println("Natural: " + natural);
		
		
		boolean aprobar = Teclado.leerBooleano("¿Voy a aprobar?(puedes poner verdadero/true or falso/false) ");
		System.out.println("Aprobar " + aprobar);
		
		double real = Teclado.leerReal("Introduce un numero real" );
		System.out.println("Real " + real);
	}

}
