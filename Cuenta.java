//Clase Cuentaancaria que contiene número, cliente y saldo.
public class Cuenta {

			//atributos de una cuenta bancaria
			private int numero;
			private String cliente;
			private double saldo; // en euros
	
			//constructor 
			// El orden importa
			public Cuenta(int numero, String cliente) {
			this.numero = numero;
			this.cliente = cliente;
			this.saldo = 0.0;
			}
		
		// Devuelve una cadena de caracteres con el estado de la cuenta bancaria.
		public String obtenerEstado() {
			return
					"Cuenta [Numero = " + numero + ", Cliente = " + cliente + ", Saldo = " + String.format("%.2f", saldo) + "]";

		}		
		// metodo de objeto por eso no pongo void
		public boolean ingresar(double importe) {
			boolean ingresado = false;
			if(importe > 0.0) {
				this.saldo = this.saldo + importe;
				ingresado =  true;
			}
			return ingresado;
			
		}
				
		public boolean retirar(double importe) {
			boolean retirado = false;
			if(importe > 0.0 && importe <= this.saldo) {
				this.saldo = this.saldo - importe;
				retirado = true;
			}
			return retirado;
		}
		
		// Transfiere un importe de la cuenta bancaria a otra cuenta.
		// Devuelve verdadero si la transferencia se ha realizado correctamente.
		// Devuelve falso el caso contrario.
		// cuenta 2 es cuenta destino
		public boolean transferir(double importe, Cuenta destino) {
			boolean transferido = false;
			if(importe > 0.0 && importe <= this.saldo) {
				this.saldo = this.saldo - importe;
				destino.saldo = destino.saldo + importe;
				transferido = true;
			}
			return transferido;
		}
		
		
}
