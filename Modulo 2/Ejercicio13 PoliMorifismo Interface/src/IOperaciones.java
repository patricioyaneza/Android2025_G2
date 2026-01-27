
public interface IOperaciones {
	
	// definir constantes 
	int IVA = 19;
	Double PI = 3.1415; 
	
	
	// DEFINIR METODOS
	boolean guardar(); // insertar una fila en la base de datos
	boolean eliminar(); // elimina una o mas fila en la base de datos
	public int modificar(); // modificar una o mas fila en la base de datos
	
}
