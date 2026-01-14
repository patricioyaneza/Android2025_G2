
public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while
		
		int numero = 0;
		while(numero++ < 10)
		{
//			numero++; // numero = numero + 1;  numero += 1;
			System.out.println("Valor del numero: " + numero);
		}
		
		// break
		System.out.println("\n\n\n==========>>> BREAK");
		
		numero = 0;
		while(numero++ < 10)
		{
			if(numero == 6)
				break;
			System.out.println("Valor actual: " + numero);
		}
		
		// continue    kənˈtinyo͞o

		numero = 0;
		while(numero++ < 1000)
		{
			if(numero%2 != 0) // impar
				continue;
			
			System.out.println("Valor par: " + numero);
		}
		
		
		System.out.println("Fin de la aplicación");
	}

}
