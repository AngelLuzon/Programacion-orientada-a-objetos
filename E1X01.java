import entrada.Teclado;
public class E1X01 {

	public static void main(String[] args) {
		public static Videojuego leerVideojuego() {
			String nombre = Teclado.leerCadena("Introduce un nombre: ");
			String desarrollador = Teclado.leerCadena("Introduce un desarrollador: ");
			int anno = Teclado.leerNatural("Introduce anno: ");
			int numMaxJug = Teclado.leerNatural("Introduce número máximo jugadores: ");
			Videojuego videojuego = new Videojuego(nombre, desarrollador, anno, numMaxJug);
			return videojuego;
			
		}
	}

}
