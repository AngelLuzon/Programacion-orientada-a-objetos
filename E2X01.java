import entrada.Teclado;
public class E2X01 {

	public static void escribirMenuOpciones() {
		System.out.println();
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Visualizar en consola las dos cuentas.");
		System.out.println("(2) Ingresar un importe en la cuenta 1.");
		System.out.println("(3) Retirar un importe de la cuenta 1.");
		System.out.println("(4) Ingresar un importe en la cuenta 2.");
		System.out.println("(5)	Retirar un importe de la cuenta 2.");
		System.out.println("(6) Transferir un importe de la cuenta 1 a la cuenta 2.");
		System.out.println("(7) Transferir un importe de la cuenta 2 a la cuenta 1.");
		System.out.println();

	}

	public static void main(String[] args) {
		int opcion;
		double importe;
		Cuenta cuenta1 = new Cuenta(1, "Francisco Gómez");
		System.out.println("Se ha creado la cuenta bancaria 1.");
		Cuenta cuenta2 = new Cuenta(2, "Victoria Serrano");
		System.out.println("Se ha creado la cuenta bancaria 2.");
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("¿Opción (0-7)? ");
			switch (opcion) {
			//salir del programa
			case 0:
				break;
				
			// Visualizar en consola las dos cuentas.
			case 1:
				
				System.out.println(cuenta1.obtenerEstado());
				System.out.println(cuenta2.obtenerEstado());
				break;
				
			// Ingresar un importe en la cuenta 1.
			case 2:
				importe = Teclado.leerReal("¿Importe? ");
				if(cuenta1.ingresar(importe)) {
					System.out.println("Se ha ingresado un importe en la cuenta bancaria.");
				}
				else {
					System.out.println("Error al ingresar un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
					System.out.println("El importe debe ser menor o igual que el saldo.");
				}
				break;
				
			// Retirar un importe de la cuenta 1.	
			case 3:
				importe = Teclado.leerReal("¿Importe? ");
				if(cuenta1.retirar(importe)) {
					System.out.println("Se ha retirado un importe en la cuenta bancaria.");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
					System.out.println("El importe debe ser menor o igual que el saldo.");
				}
				break;	
				
			// Ingresar un importe en la cuenta 2.
			case 4:
				importe = Teclado.leerReal("¿Importe? ");
				if(cuenta1.ingresar(importe)) {
					System.out.println("Se ha ingresado un importe en la cuenta bancaria.");
				}
				else {
					System.out.println("Error al ingresar un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
				}
				break;
				
			// 	Retirar un importe de la cuenta 2.

			case 5:
				importe = Teclado.leerReal("¿Importe? ");
				if(cuenta1.retirar(importe)) {
					System.out.println("Se ha retirado un importe en la cuenta bancaria.");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
					System.out.println("El importe debe ser menor o igual que el saldo.");
				}
				break;
				
			// Transferir un importe de la cuenta 1 a la cuenta 2 	
			case 6:
				importe = Teclado.leerReal("¿Importe a transferencia [1] >>> [2]? ");
				if(cuenta1.transferir(importe, cuenta2)) {
					System.out.println("Se ha transferido el importe de la cuenta [1] >>> [2].");
				}
				else {
					System.out.println("Se ha retirado un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
					
				}
				break;	
				
			//	Transferir un importe de la cuenta 2 a la cuenta 1.
			case 7:
				importe = Teclado.leerReal("¿Importe a transferencia [2] >>> [1]? ");
				if(cuenta2.transferir(importe, cuenta1)) {
					System.out.println("Se ha transferido el importe de la cuenta [2] >>> [1].");
				}
				else {
					System.out.println("Se ha retirado un importe en la cuenta bancaria.");
					System.out.println("El importe debe ser positivo.");
				}
				break;	
				
				
			default:
				System.out.println("La opción de menú debe estar comprendida entre 0 y 7.");	
				
				
			}

		
		}
		while(opcion != 0);
		System.out.println();
	}
}