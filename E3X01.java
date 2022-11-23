import entrada.Teclado;

public class E3X01 {

	// Escribe en consola el menú de opciones del programa principal.
	public static void escribirMenuOpciones() {
		System.out.println();
		System.out.println("(0) Salir del progrma.");
		System.out.println("(1) Crear un libro a partir de datos leídos por teclado.");
		System.out.println("(2) Visualizar en consola el libro.");
		System.out.println("(3) Modificar el título del libro.");
		System.out.println("(4) Modificar el número de ejemplares del libro.");
		System.out.println("(5) Modificar el precio del libro.");
		System.out.println("(6) Visualizar en consola el título del libro.");
		System.out.println("(7) Visualizar en consola el número de ejemplares del libro.");
		System.out.println("(8) Visualizar en consola el precio del libro.");
		System.out.println();
	}
	public static void main(String[] args) {
		int opcion,numeroEjemplares;
		String titulo;
		double precio;
		Libro libro = null;
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("Introduce una opcion(0 - 8): ");
			switch (opcion) {
			//salir del programa
			case 0:
				break;
				
			//Crear un libro a partir de datos leídos por teclado.
			case 1:
				if(libro == null) {
					titulo = Teclado.leerCadena("Introduce título: ");
					numeroEjemplares = Teclado.leerEntero("Introduce número de ejemplares: ");
					precio = Teclado.leerReal("Introduce precio: ");
					libro = new Libro(titulo, numeroEjemplares, precio);
					System.out.println("Se ha creado un libro.");
					
				}
				else {
					System.out.println("Ya existe un libro creado.");
				}
				break;
			
			//Visualizar en consola el libro.
			case 2:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
					System.out.println(libro.obtenerEstado());
				}
				break;
				
			//Modificar el título del libro.	
			case 3:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce titulo: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				}
				break;
				
			//Modificar el número de ejemplares del libro.	
			case 4:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce titulo: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				}
				break;
				
			//Modificar el precio del libro.
			case 5:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce titulo: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				}
				break;
				
			//Visualizar en consola el título del libro.	
			case 6:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
					System.out.println("Título: " + libro.getTitulo());
				}
				break;
				
			//Visualizar en consola el número de ejemplares del libro.	
			case 7:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce titulo: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				}
				break;
				
			//Visualizar en consola el precio del libro.
			case 8:
				if(libro == null) {
					System.out.println("Antes se debe crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce titulo: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				}
				break;
				
			//Opción no válida	
			default:
				System.out.println("Programa finalizado.");
				
			}
		
		}
		while(opcion != 0);
		System.out.println("Programa finalizado.");
	}

}
