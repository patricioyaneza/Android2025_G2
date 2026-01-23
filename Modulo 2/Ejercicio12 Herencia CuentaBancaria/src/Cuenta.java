
public class Cuenta {
// atributos
	
	private int numeroCuenta;
	private String nombreTitular;
	private double saldoCuenta;
	// constructor
	public Cuenta () {
		this.nombreTitular = "";
		this.numeroCuenta = 0;
		this.saldoCuenta = 0;
	}

	public Cuenta (int numeroCuenta, String nombreTitular, double saldoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular.trim().toUpperCase();
		this.saldoCuenta = saldoCuenta;
	}
	
	
	// getter and setter
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular.trim().toUpperCase();
	}
		public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	// metodos personalizados o propios
	public void imprimir() {

		System.out.println("========================== Cuenta Registrada ==========================");
		System.out.println();
		System.out.println("Número de la cuenta             : " + this.numeroCuenta);
		System.out.println("Nombre del titular de la cuenta : " + this.nombreTitular);
		System.out.println("Saldo inicial de la cuenta      : " + this.saldoCuenta);
		System.out.println();
		System.out.println("====================================================================");
	}
	
	public void depositar(double montoDeposito) {
		if (montoDeposito<=0)
			System.out.println("No se puede realizar operacion el monto a depositar debe ser mayor a 0");
		else
		{
			this.saldoCuenta+=montoDeposito;
			System.out.println("\nDepósito de $ " + montoDeposito + " realizado, el nuevo saldo es $ " + this.saldoCuenta);	
		}
	}
	
	public void retirar() // girar desde la cuenta
	{
		
	}
}
