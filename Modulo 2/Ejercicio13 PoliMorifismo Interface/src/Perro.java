
public class Perro extends Animal {

	@Override
	public String comer() {
		return "Comida de perro";
	}

	@Override
	public String dormir() {
		return "zzzzzZZ de perro";
	}

	@Override
	public String emitirSonido() {
		return "Guau!!!";
	}
	
	public void imprimir()
	{
		System.out.println("Hola soy un perro");
	}

}
