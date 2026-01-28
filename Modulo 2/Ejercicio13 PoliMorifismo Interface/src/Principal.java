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
		
		// creación de colección tipo arraylist para almacenar
		// n animales (Animal, Perro o Gato)
		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(animal); // se agrega objeto a la coleccion
		animales.add(animal2);
		animales.add(animal3);
		animales.add(new Perro());
		animales.add(new Gato());
		
		// se utiliza for para recorrer el arraylist y acceder a los
		// objetos que la coleccion tiene
		System.out.println("Recorrer arreglo!!!");
		for(Animal aux: animales) // for each
		{
			System.out.println(aux.emitirSonido());
		}
		
	}
}
