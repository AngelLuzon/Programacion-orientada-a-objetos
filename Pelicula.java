
public class Pelicula {

	//atributos
	//String es una clase se escribe primera en mayuscula
	//misma función que un int
	//private para que sean privados y solo los pueda ver la clase
	//para que otros programas no lo modifiquen
	private String nombre;
	private int duracion;
	private boolean dobladaCastellano;
	private double puntuacion;
	
	//constructor
	public Pelicula(String nombre, int duracion, boolean  dobladaCastellano, double puntuacion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this .dobladaCastellano = dobladaCastellano;
		this.puntuacion = puntuacion;
	}
	
	//metodos de acceso a atributos(para obtenerlos)
	public String getNombre() {
		return nombre;
	}
	
	public int getDuracion() {
		return duracion;
	
	}
	
	public boolean getDobladaCastellano() {
		return dobladaCastellano;
	}
	
	public double getPuntuacion() {
		return puntuacion;
	}
	
	//metodos de acceso a atributos (setters) (para modificarlos)
	//se pone el mismo nombre que el de arriba
	//se pone this.(referencia al objeto creado en memoria)
	//el nombre del String es un nuevo nombre
	//set para modificar valor
	//get para conseguir valor
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDuracion(int duracione) {
		this.duracion = duracion;
	}
	
	public void setdobladaCastellano(boolean dobladaCastellano) {
		this.dobladaCastellano = dobladaCastellano;
	}
	
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	//Devuelve una cadena de caracteres con el estado del objeto.
	public String obtenerEstado() {
		return
//			"Pelicula [Nombre = " + nombre +
//			", Duracion = " + duracion +
//			", DobladaCastellano = " + dobladaCastellano +
//			", Puntuacion = " + puntuacion +
//			"]";
		
			"Pelicula [Nombre = " + nombre + ", Duracion = " + duracion + ", DobladaCastellano = " + dobladaCastellano + ", Puntuacion = " + puntuacion + "]";
	
	
	
	
	
	
	
	}
	
	
}
