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
		
		Vehiculo auto1 = new Vehiculo(patente, marca, modelo);
		Vehiculo auto2 = new Vehiculo("jGgg90", "BWM", "AS40");
		
		auto1.imprimir();
		auto2.imprimir();
		
		auto2.setModelo("AT400"); // Permite modificar el modelo
		auto2.imprimir();
		
		// Mini Ejercicio: Imprimir la marca del auto2  // permite obtener la marca
		System.out.println("marca auto 2: " + auto2.getMarca());
	

		Vehiculo auto3 = new Vehiculo();
		// Mini ejercicio: Agregar los datos requeridos por Vehiculo
		auto3.setModelo("j-258");
		auto3.setMarca("volvo");
		auto3.setPatente("bl0489");
		auto3.imprimir();
	}

}
