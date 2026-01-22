
public class Vehiculo {

	// atributos
	 private String patente;
	 private String marca;
	 private String modelo;

	// metodo constructor
	public Vehiculo()
	{
		this.patente = "";
		this.marca = "";
		this.modelo = "";
	}

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
	}
}
