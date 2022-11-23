import java.util.Random;

public class EjemplosRandom {

	public static void main(String[] args) {
		// Instanciar un objeto de la clase Random
		Random aleatorio = new Random();
		
		
		// Generar un entero entre 20 y 30
		int ent = aleatorio.nextInt(30 - 20 + 1) + 20;
		System.out.println("Entero entre 20 y 30:  " + ent);
		
		// Generar un entero entre -100 y 100.
		ent = aleatorio.nextInt(100 + 100 + 1) - 100;
		System.out.println("Entero entre -100 y 100: " + ent);

		// Así es la formula.
		int min = -100;
		int max = 100;	
		ent = aleatorio.nextInt(max - min + 1) + min;
		System.out.println("Entero entre -100 y 100: " + ent);
		
		// Generar un real entre 25.6 y 37.8
		double real = aleatorio.nextDouble(37.8 -25.6) +25.6;
		System.out.println("Real entre 25.6 y 37.8*: " + real);
		System.out.println("No incluye 37.8.");
		
		double minimo = -12.5;
		double maximo = 7.2;
		real = aleatorio.nextDouble(minimo, maximo);
	
	}

}
