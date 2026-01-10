import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un arreglo para 5 nombres
		 * solicitar al usuario que los ingrese
		 * guardar en el arreglo, todos en mayusculas
		 * una vez guardado, imprimir
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[5];
		System.out.print("Ingrese 1er nombre:");
		nombres[0] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 2do nombre:");
		nombres[1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 3ro nombre:");
		nombres[2] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 4to nombre:");
		nombres[3] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 5to nombre:");
		nombres[4] = teclado.nextLine().toUpperCase();
		
		System.out.println("****** Nombres Almacenados ******");
		System.out.println("Nombre 1: " + nombres[0]);
		System.out.println("Nombre 2: " + nombres[1]);
		System.out.println("Nombre 3: " + nombres[2]);
		System.out.println("Nombre 4: " + nombres[3]);
		System.out.println("Nombre 5: " + nombres[4]);
		
	}

}
