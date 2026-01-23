
public class Automovil extends Vehiculo {
	/**
	 * Atributos exclusivos de los automoviles
	 */

	private int cantidadPuertas;
	private String cajaCambios;
	private boolean aireAcondicionado; // true con aire false sin aire

	/**
	* Constructors
	*/
	public Automovil() {
		super();
		this.cantidadPuertas = 0;
		this.cajaCambios = "";
		this.aireAcondicionado = false;
	}

	public Automovil(String patente, String marca, String modelo, int cantidadPuertas, String cajaCambios, boolean aireAcondicionado) {
		super(patente, marca, modelo);
		this.cantidadPuertas = cantidadPuertas;
		this.cajaCambios = cajaCambios;
		this.aireAcondicionado = aireAcondicionado;
	}

	/**
	 * getters and setters
	 */

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantPuertas) {
		this.cantidadPuertas = cantPuertas;
	}

	public String getCajaCambios() {
		return cajaCambios;
	}

	public void setCajaCambios(String cajaCambios) {
		this.cajaCambios = cajaCambios;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	@Override
	public void imprimir() {
		System.out.println("\n======================= Datos del Automovil =======================");
		System.out.println("Patente      : " + getPatente());
		System.out.println("Marca        : " + getMarca());
		System.out.println("Modelo       : " + getModelo());
		System.out.println("Asientos     : " + this.cantidadPuertas);
		System.out.println("Tipo de caja : " + this.cajaCambios);

		if (this.aireAcondicionado)
			System.out.println("Otros        : CON Aire Acondicionado");
		else
			System.out.println("Otros        : SIN Aire Acondicionado");

		System.out.println("\n===================================================================");
	}
	
	public void caracteristicas()
	{
		System.out.println("Asientos           : " + this.cantidadPuertas);
		System.out.println("Tipo de caja       : " + this.cajaCambios);
		System.out.println("Aire Acondicionado : " + (aireAcondicionado ? "Sí" : "No"));
	}

}
