import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ejercicio 13:
		 *  Crear una matriz guarda el nombre y el apellido de 5 personas		 * 
		 *  
		 */
		
		Scanner teclado = new Scanner(System.in);
		String[][] nombres = new String[5][2];
		System.out.print("Ingrese 1er nombre y apellido:");
		nombres[0][0] = teclado.nextLine().toUpperCase();
		nombres[0][1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 2do nombre y apellido:");
		nombres[1][0] = teclado.nextLine().toUpperCase();
		nombres[1][1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 3ro nombre y apellido:");
		nombres[2][0] = teclado.nextLine().toUpperCase();
		nombres[2][1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 4to nombre y apellido:");
		nombres[3][0] = teclado.nextLine().toUpperCase();
		nombres[3][1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 5to nombre y apellido:");
		nombres[4][0] = teclado.nextLine().toUpperCase();
		nombres[4][1] = teclado.nextLine().toUpperCase();
		
		System.out.println("****** Nombres Almacenados ******");
		System.out.println("Nombre 1: " + nombres[0][0] + " " + nombres[0][1]);
		System.out.println("Nombre 2: " + nombres[1][0] + " " + nombres[1][1]);
		System.out.println("Nombre 3: " + nombres[2][0] + " " + nombres[2][1]);
		System.out.println("Nombre 4: " + nombres[3][0] + " " + nombres[3][1]);
		System.out.println("Nombre 5: " + nombres[4][0] + " " + nombres[4][1]);
		
		
	}

}
