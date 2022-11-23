
public class Libro {

	// atributos
	private String titulo;
	private int numeroEjemplares;
	private double precio;
	
	// constructor con 3 parámetros
	public Libro(String titulo, int numeroEjemplares, double precio) {
		this.titulo = titulo;
		this.numeroEjemplares = numeroEjemplares;
		this.precio = precio;
	}
	
	// Devuelve una cadena de caracteres con el estado del libro
	public String obtenerEstado() {
		return
			"Libro [ítulo = " + titulo + ", NumeroEjemplares = " + numeroEjemplares + "Precio = " + precio + String.format("%.2f", precio) + "]";
	}
	
	// Devuelve el titulo del libro
	public String getTitulo() {
		return titulo;
	}
	
	// Modifica el titulo del libro
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
