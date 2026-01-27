
public class Animal implements IOperaciones {
	
	private String nombre;
	
	public Animal() {
		this.nombre = "";
	}
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	public String comer()
	{
		return "Comida de animal";
	}
	
	public String dormir()
	{
		return "zzzzZZZ de animal";
	}
	
	public String emitirSonido()
	{
		return "Ruido animal";
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Hola");
	}
}
