
public class CuentaUSD extends Cuenta {
	// atributos
	private double tipoCambio; // guardará el valor actual de 1 dolar

	
	// constructores
	public CuentaUSD() {
		super();
		// -1 significa que no se ha ingresado valor actual del dolar
		this.tipoCambio = -1; 
	}
	
	public CuentaUSD(int numeroCuenta, String nombreTitular, double saldoCuenta, double tipoCambio) {
		super(numeroCuenta, nombreTitular, saldoCuenta);
		this.tipoCambio = tipoCambio;
	}	
	// getter and setter // mutador y accesor
	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(int tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	
	// metodos personalizados/ propio / custom (customer)
	// sobre escritura
	
	@Override
	public void depositar(double montoDeposito) {
		// TODO Auto-generated method stub
		if (this.tipoCambio < 0)
			System.out.println("\n********** ERROR: Falta ingresar el tipo de cambio para depositar.");
		else
		{
			montoDeposito *= this.tipoCambio;
			super.depositar(montoDeposito);
		}
	}

	@Override
	public void retirar(double monto) { // o girar desde la cuenta
		if (this.tipoCambio < 0)
			System.out.println("Error, debe ingresar un tipo de cambio mayor a cero");
		else {
			monto *= this.tipoCambio;
			super.retirar(monto);
		}
	}	
	
	public void enviarCartola()
	{
		System.out.println("\n\n*********** Cartola de la cuenta ************");
		System.out.println("Cuenta       : " + getNumeroCuenta());
		System.out.println("Saldo actual : " + getSaldoCuenta());
		System.out.println("*********************************************");
	}
}
