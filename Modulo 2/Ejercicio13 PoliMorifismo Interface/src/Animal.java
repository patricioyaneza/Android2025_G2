
public class Animal implements IOperaciones {
	public static void main(String[] args)
	{
		System.out.println("Hola");
	}

	@Override
	public boolean guardar() {
		// TODO Auto-generated method stub
		System.out.println("Datos guardados");
		return true;
	}

	@Override
	public boolean eliminar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int modificar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
