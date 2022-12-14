package Constructor;

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;

	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

//	public Tiempo() {
//		random aleatorio = new Random();
//	}
	public String obtenerEstado() {
		return String.format("%02d : %02d : %02d", this.horas, this.minutos, this.segundos);
	}

	public boolean sumar(Tiempo otro) {
		int segundos = this.segundos + otro.segundos;
		int minutos = this.minutos + otro.minutos;
		int horas = this.horas + otro.horas;
		boolean calculoExito = false;
		if (segundos >= 60) {
			segundos = segundos - 60;
			minutos++;
		}
		if (minutos >= 60) {
			minutos = minutos - 60;
			horas++;
		}
		if (horas < 24) {
			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;
			calculoExito = true;
		}
		return calculoExito;
	}

	public boolean restar(Tiempo otro) {
		int segundos = this.segundos - otro.segundos;
		int minutos = this.minutos - otro.minutos;
		int horas = this.horas - otro.horas;
		boolean calculoExito = false;
		if (segundos >= 0) {
			segundos = segundos + 60;
			minutos--;
		}
		if (minutos >= 0) {
			minutos = minutos + 60;
			horas--;
		}
		if (horas >= 0) {
			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;
			calculoExito = true;
		}
		return calculoExito;
	}

	public static boolean esValido(int horas, int minutos, int segundos) {
		if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 59 && segundos >= 0 && segundos < 59) {
			return true;
		} else {
			return false;
		}

	}
}