import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args)
	{
		System.out.println("Hola");
		Animal animal = new Animal();
		String sonido = animal.emitirSonido();
		System.out.println("Sonido de animal 1: " + sonido);
		
		Animal animal2 = new Perro();
		sonido = animal2.emitirSonido(); // polimorfismo		
		System.out.println("Sonido de animal 2: " + sonido);

		Perro perro = (Perro)animal2; // (int)0.10564
		perro.imprimir();
		
		Animal animal3 = new Gato();
		sonido = animal3.emitirSonido(); // polimorfismo
		
		System.out.println("Sonido de animal 3: " + sonido);
		
		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(animal);
		animales.add(animal2);
		animales.add(animal3);
		animales.add(new Perro());
		animales.add(new Gato());
		
		System.out.println("Recorrer arreglo!!!");
		for(Animal aux: animales) // for each
		{
			System.out.println(aux.emitirSonido());
		}
		
	}
}
