import entrada.Teclado;
public class E1X01 {

	public static void main(String[] args) {
		//anno es año(year)
		String nombre, desarrollador;
		int anno, numMaxJug;
		
		nombre = Teclado.leerCadena("Introduce un nombre: ");
		desarrollador = Teclado.leerCadena("Introduce un desarrollador: ");
		anno = Teclado.leerNatural("Introduce anno: ");
		numMaxJug = Teclado.leerNatural("Introduce número máximo jugadores: ");
		
			
		Videojuego videojuego1 = new Videojuego(nombre, desarrollador, anno, numMaxJug);
		System.out.println(videojuego1.obtenerEstado());
			
		System.out.println("VIDEOJUEGO 2");
		nombre = Teclado.leerCadena("Introduce un nombre: ");
		desarrollador = Teclado.leerCadena("Introduce un desarrollador: ");
		anno = Teclado.leerNatural("Introduce anno: ");
		Videojuego videojuego2 = new Videojuego(nombre, desarrollador, anno);
		System.out.println(videojuego2.obtenerEstado());
		
		System.out.println("VIDEOJUEGO 3");
		nombre = Teclado.leerCadena("Introduce un nombre: ");
		desarrollador = Teclado.leerCadena("Introduce un desarrollador: ");	
		Videojuego videojuego3 = new Videojuego(nombre, desarrollador);
		System.out.println(videojuego3.obtenerEstado());
	}

}
