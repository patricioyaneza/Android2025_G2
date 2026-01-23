
public class Automovil extends Vehiculo {
	/**
	 * Atributos exclusivos de los automoviles
	 */

	private int cantPuertas;
	private String cajaCambios;
	private boolean aireAcondicionado; // true con aire false sin aire

	/**
	* Constructors
	*/
	public Automovil() {
		this.cantPuertas = 0;
		this.cajaCambios = "";
		this.aireAcondicionado = false;
	}

	public Automovil(int cantPuertas, String cajaCambios, boolean aireAcondicionado) {
		this.cantPuertas = cantPuertas;
		this.cajaCambios = cajaCambios;
		this.aireAcondicionado = aireAcondicionado;
	}

	/**
	 * getters and setters
	 */

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
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
		System.out.println("\n ======================= Datos del Automovil =======================");
		System.out.println("Patente 	     : " + getPatente());
		System.out.println("Marca        : " + getMarca());
		System.out.println("Modelo       : " + getModelo());
		System.out.println("Asientos     : " + this.cantPuertas);
		System.out.println("Tipo de caja : " + this.cajaCambios);

		if (this.aireAcondicionado)
			System.out.println("Asientos     : CON Aire Acondicionado");
		else
			System.out.println("Asientos     : SIN Aire Acondicionado");

		System.out.println("\n ===================================================================");
	}
	
	public void caracteristicas()
	{
		System.out.println("Asientos           : " + this.cantPuertas);
		System.out.println("Tipo de caja       : " + this.cajaCambios);
		System.out.println("Aire Acondicionado : " + this.aireAcondicionado);
	}

}
