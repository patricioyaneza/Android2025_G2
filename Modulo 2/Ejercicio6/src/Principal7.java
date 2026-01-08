import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EJERICICIO 7:

		Para una empresa de domotica, se requiere encender artefactos 
		disponibles en la empresa.
		Los dispositivos disponibles son: OF1, OF2, OF3, 
		MAQUINA1, MAQUINA2 y VENTILADORES
		La aplicacion debe solicitar el nombre del dispositivo o su numero 
		y "encender" el dispositivo solicitado.

		*/
		Scanner leerDispositivo = new Scanner(System.in);
		System.out.print("➤ Ingrese el nombre del dispositivo a encender: ");
		String dispositivo = leerDispositivo.next();

		switch(dispositivo.toUpperCase()) {
			case "OF1":
				System.out.println("OF1 encendida");
				break;
			case "OF2":
				System.out.println("OF2 encendida");
				break;
			case "OF3":
				System.out.println("OF3 encendida");
				break;
			case "MAQUINA1":
				System.out.println("MAQUINA1 encendida");
				break;
			case "MAQUINA2":
				System.out.println("MAQUINA2 encendida");
				break;
			case "VENTILADORES":
				System.out.println("VENTILADORES encendidos");
				break;
			default:
				System.out.println("Dispositivo no válido");
		}
		System.out.println("Fin");
		
	}

}
