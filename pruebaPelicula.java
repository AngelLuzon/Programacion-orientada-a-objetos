import entrada.Teclado;
public class pruebaPelicula {
	
	//Leer per pelicula por teclado.
	public static Pelicula leerPelicula() {
		String nombre = Teclado.leerCadena("Introduce un nombre: ");
		int duracion = Teclado.leerNatural("Introduce un duracion: ");
		boolean dobladaCastellano = Teclado.leerBooleano("¿Está doblada al castellano? ");
		double puntuacion = Teclado.leerReal("Introduce la puntuacion: ");
		Pelicula pelicula = new Pelicula(nombre, duracion, dobladaCastellano, puntuacion);
		return pelicula;
	}

	public static void main(String[] args) {
		//Pelicula pelicula 1 = declaracion, se reserva un espacio en memoria
		//pelicula1 = new Pelicula( , , ); new es un constructor y esta instantuando
		//( , ) seran los valores que saldran
//		Pelicula pelicula1 = new Pelicula(null, 0, false, 0);
//		System.out.println(pelicula1.getNombre());
//		System.out.println(pelicula1.getDuracion());
//		System.out.println(pelicula1.getDobladaCastellano());
//		System.out.println(pelicula1.getPuntuacion());
//
//		pelicula1.setNombre("El señor de los Anillos: El Retorno del Rey ");
//		pelicula1.setDuracion(205);
//		pelicula1.setdobladaCastellano(true);
//		pelicula1.setPuntuacion(9.7);	
//
//		System.out.println(pelicula1.getNombre());
//		System.out.println(pelicula1.getDuracion());
//		System.out.println(pelicula1.getDobladaCastellano());
//		System.out.println(pelicula1.getPuntuacion());
//
//
//
//
//
//		String nombre = Teclado.leerCadena("Introduce un nombre: ");
//		int duracion = Teclado.leerNatural("Introduce un duracion: ");
//		boolean dobladaCastellano = Teclado.leerBooleano("¿Está doblada al castellano? ");
//		double puntuacion = Teclado.leerReal("Introduce la puntuacion: ");
//		
//		
//		
//
//		Pelicula pelicula2= new Pelicula(nombre, duracion, dobladaCastellano, puntuacion);
//		System.out.println(pelicula2.getNombre());
//		System.out.println(pelicula2.getDuracion());
//		System.out.println(pelicula2.getDobladaCastellano());
//		System.out.println(pelicula2.getPuntuacion());
//		
//		pelicula2.setNombre("Titanicy ");
//		pelicula2.setDuracion(180);
//		pelicula2.setdobladaCastellano(true);
//		pelicula2.setPuntuacion(8.2);	

		Pelicula peli = leerPelicula();
//		System.out.println(pelicula2.obtenerEstado());
		System.out.println(peli.obtenerEstado());
	}

}
