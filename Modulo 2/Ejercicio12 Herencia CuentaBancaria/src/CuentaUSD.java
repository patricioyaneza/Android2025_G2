
public class CuentaUSD extends Cuenta {
	// atributos
	int tipoCambio; // guardará el valor actual de 1 dolar

	
	// constructores
	public CuentaUSD() {
		super();
		// -1 significa que no se ha ingresado valor actual del dolar
		this.tipoCambio = -1; 
	}
	
	public CuentaUSD(int numeroCuenta, String nombreTitular, double saldoCuenta, int tipoCambio) {
		super(numeroCuenta, nombreTitular, saldoCuenta);
		this.tipoCambio = tipoCambio;
	}	
	// getter and setter // mutador y accesor
	public int getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(int tipoCambio) {
		this.tipoCambio = tipoCambio;
	}	
	
	// metodos personalizados/ propio / custom (customer)
}
