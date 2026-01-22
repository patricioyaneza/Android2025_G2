
public class Moto extends Vehiculo {
	// atributos
	private int medidaManillar;
	private String estilo; // chopper, enduro, racer, cross ==> solo se vende
	// constructor
	
	public Moto() {
		this.medidaManillar = 0;
		this.estilo = "";
	}

	// getter and setter - accesador / mutador	
	public int getMedidaManillar() {
		return medidaManillar;
	}
	public void setMedidaManillar(int medidaManillar) {
		this.medidaManillar = medidaManillar;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	// metodos personalizados, propios y customer
	
	@Override
	public void imprimir() {
		System.out.println("\n=========== Datos de la Moto ==============");
		System.out.println("Patente    : " + getPatente());
		System.out.println("Marca      : " + getMarca());
		System.out.println("Modelo     : " + getModelo());
		System.out.println("Manillar   : " + this.medidaManillar);
		System.out.println("Estilo     : " + this.estilo);
		System.out.println("=============================================");
	}
		
}
