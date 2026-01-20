
public class Vehiculo {

	// atributos
	// tipo de dato nombre    
	// encapsular 
	 private String patente;
	 private String marca;
	 private String modelo;
/*	
	String color;
	int precioCosto;
	int precioVenta;
*/
	// metodo constructor
	// new Vehiculo();
	public Vehiculo()
	{
		this.patente = "";
		this.marca = "";
		this.modelo = "";
	}
	// new Vehiculo("fasd30","Toyota", "asf 60");
	public Vehiculo(String patente, String marca, String modelo) 
	{
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}	
	// getter & setter
	
	
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	// metodos propios	
	public void imprimir()
	{
		System.out.println("\n=========== Datos del Vehiculo ==============");
		System.out.println("Patente    : " + this.patente);
		System.out.println("Marca      : " + this.marca);
		System.out.println("Modelo     : " + this.modelo);
		System.out.println("=============================================");

		// ultra wide  -> 16:9   21:9 
	}
}
