// Información de un tiempo: horas, minutos y segundos
public class Tiempo {

	
			//atributos de tiempo
			private int horas, minutos, segundos;
			
			//constructor
			public Tiempo(int horas, int  minutos, int segundos) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
			}
			
			// devuelva el estado del tiempo como cadena de caracteres,
			// expresado con el formato hh:mm:ss.
			public String obtenerEstado() {
				return
						"Tiempo [horas = " + horas + ", minutos = " + minutos + ", segundos = " + segundos                                                                                                          + "]";
			}
}
