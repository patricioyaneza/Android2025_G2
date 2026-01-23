
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto moto = new Moto();
		moto.setPatente("AXTL35");
		moto.setMarca("Toyota");
		moto.setModelo("super uper");
		moto.setMedidaManillar(55);
		moto.setEstilo("Chopper");
		moto.imprimir();
		
		/**
		 *  Ejercicio 24:
		 * Crear la clase Automovil Agregar 2 atributos 
		 * adicionales
		 * (cuenta con aire acondicionado, cantidad  puertas) 
		 * Heredar de Vehiculo.
		 * Crear un objeto Automovil, asignar datos 
		 * y mostrar en consola		 * 
		 * 
		 */
		Automovil automovil = new Automovil();
		automovil.setPatente("SZ7590");
		automovil.setMarca("Toyota");
		automovil.setModelo("FH5544");
		automovil.setAireAcondicionado(false);
		automovil.setCantidadPuertas(5);
		automovil.setCajaCambios("Mecánica");
		automovil.imprimir();
		
		System.out.println("\nDetalles técnicos");
		automovil.caracteristicas();
		

		Automovil automovil2 = new Automovil("qwer60", "peogeut", "308", 5, "Automática", false);
		automovil2.imprimir();
		
	}

}
