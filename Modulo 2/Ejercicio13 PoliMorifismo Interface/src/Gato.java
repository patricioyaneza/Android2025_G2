// heredar mas de una clase. varias interface
public class Gato extends Animal implements IOperaciones, Impuestos {
	@Override
	public String comer() {
		return "Comida de gato";
	}

	@Override
	public String dormir() {
		return "zzzzzZZ de gato";
	}

	@Override
	public String emitirSonido() {
		return "Miauu!!!";
	}
}
