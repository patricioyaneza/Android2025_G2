import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 10:
		 * 
		 * 1.- Ingrese un rut con digito verificador y muestre solo el numero
		 * o sea, sin guion ni digito verificador
		 * 20100300-5  => 20100300
		 *  9200350-7  =>  9200350
		 *153100200-1  =>153100200
		 *  
		 * 2.- Aparte, mostrar el digito verificador
		 *  9200350-7  => 7
			
			
 * 			3.- Mostar los ultimos 4 digitos del numero rut que se utilizarán 
 * 			como clave para acceder a un archivo
 * 
 * 		20103500-K  => 3500
 * 		 9759654-1	=> 9654 
 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese su rut: ");
		String rut = scanner.nextLine();

		if (rut.contains("-")) {
			String numeroRut = rut.substring(0, rut.indexOf("-"));
			System.out.println("rut: " + numeroRut);
		} else {
			System.out.println("rut incorrecto.");
		}
		
		String digitoVerificador = rut.substring(rut.indexOf("-") + 1);
		System.out.println("digito verificador: " + digitoVerificador);
		

		int posGuion = rut.indexOf("-");
		String clave = rut.substring(posGuion - 4, posGuion);
		System.out.println("Clave generada (últimos 4 digitos): " + clave);
		
	}

}
