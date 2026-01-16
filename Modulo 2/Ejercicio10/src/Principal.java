import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******* Automotora Autito Feliz 😊 ********");
		
		Scanner leer = new Scanner(System.in);
		String patente;
		String marca;
		String modelo = "";
		
		System.out.print("Ingrese patente :");
		patente = leer.next();
		System.out.print("Ingrese marca :");
		marca = leer.next();
		System.out.print("Ingrese modelo :");
		modelo = leer.next();
		
		Automovil auto1 = new Automovil(patente, marca, modelo);
		Automovil auto2 = new Automovil("jGgg90", "BWM", "AS40");
		
		
		auto1.imprimir();
		auto2.imprimir();
		
	}

}
