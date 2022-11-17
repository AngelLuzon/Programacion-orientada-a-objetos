
public class Videojuego {

		
		//atributos
		private String nombre;
		private String desarrollador;
		private int anno;
		private int numMaxJug;
		
		//constructor
		public Videojuego(String nombre, String desarrollador, int anno, int numMaxJug) {
			this.nombre = nombre;
			this.desarrollador = desarrollador;
			this.anno = anno;
			this.numMaxJug = numMaxJug;
			
		}
			
		
		
		// Devuelve una cadena de caracteres con el estado del videojuego
		public String obtenerEstado() {
			return
				"Videojuego `Nombre = " + nombre +
				", Desarrollador = " + desarrollador +
				", Añp = " + anno +
				", NumJugMax = " + numMaxJug +
				"]";
				
		}
		
		//constructor 2
		public Videojuego(String nombre, String desarrollador, int anno) {
			this.nombre = nombre;
			this.desarrollador = desarrollador;
			this.anno = anno;
			this.numMaxJug = 1;
			
		}	
		
		//constructor 3
		public Videojuego(String nombre, String desarrollador) {
			this.nombre = nombre;
			this.desarrollador = desarrollador;
			this.anno = 2021;
			this.numMaxJug = 1;
		}
}
