
public class Automovil {

	// atributos
	// tipo de dato nombre    // AL7050  JGGG90
	String patente;
	String marca;
	String modelo;
/*	
	String color;
	int precioCosto;
	int precioVenta;
*/
	// metodo constructor
	public Automovil(String patente, String marca, String modelo)
	{
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// metodos propios
	
	public void imprimir()
	{
		System.out.println("\n=========== Datos del Automóvil =============");
		System.out.println("Patente    : " + this.patente);
		System.out.println("Marca      : " + this.marca);
		System.out.println("Modelo     : " + this.modelo);
		System.out.println("=============================================");

		// ultra wide  -> 16:9   21:9 
	}
}
