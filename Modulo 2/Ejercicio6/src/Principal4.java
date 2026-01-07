import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio:
		// Simular un login de usuario y permitir acceso a la aplicación
		// si las credenciales corresponde
		// 2 variables (usuario y clave) 
		// 1ro evaluar si nombre usuario existe y despues si la clave es correcta
		
		Scanner sc = new Scanner(System.in);

		String usuario = "admin";
		String clave = "1234";

		System.out.print("Ingrese usuario: ");
		String usuario2 = sc.nextLine();

//		if (usuario2.equals(usuario)) {
		if (usuario2.equalsIgnoreCase(usuario)) {
//			if (usuario2 == usuario) { // no comparar con ==

			System.out.print("Ingrese clave: ");
			String clave2 = sc.nextLine();
	
			if (clave2.equals(clave)) {
				System.out.println("Acceso permitido. Bienvenido a la aplicación.");
			} else {
				System.out.println("Clave incorrecta.");
			}

		} else {
			System.out.println("Usuario no existe.");
		}
	}

}
