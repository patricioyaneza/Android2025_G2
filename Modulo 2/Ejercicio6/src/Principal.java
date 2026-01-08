
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sentencia if
		
		int valor = 10;
		
		if(valor > 0)
		{
			System.out.println("El número es positivo. 1");
		}		
		
		if(valor < 0)
		{
			System.out.println("El número es negativo");
			System.out.println("El número es negativo");
			System.out.println("El número es negativo");
		}
		else
		{
			System.out.println("======================");
			System.out.println("El número es positivo. 2");
			System.out.println("======================");
		}

		System.out.println("Evaluar con if else if ");
		// numero es +, - y neutro (0)
		if(valor < 0)
		{
			System.out.println("El número es negativo -");			
		}
		else if(valor == 0)
		{
			System.out.println("El número es cero");
		}
		else 
		{
			System.out.println("El número es Positivo +");
		}
		
// Ejercicio 2: ver Principal2
		
		
		boolean existe = false;
		
		if(existe)
			System.out.println("======> Si existe.");
		else
			System.out.println("======> No existe.");
		
		
		int valor2 = 10;
		boolean esMayorDeEdad = false;
		String resultado = "";
		
		esMayorDeEdad = valor2 >= 18 ? true : false;
		resultado = valor2 >= 18? "Si": "No";
		System.out.println("Es mayor de edad: " + esMayorDeEdad);
		System.out.println("Es mayor de edad: " + resultado);
		System.out.println("Es mayor de edad: " + (valor2 >= 18 ?"Si":"No"));
		
		
		System.out.println("=======  Fin de la aplicación  ========");
	}

}
