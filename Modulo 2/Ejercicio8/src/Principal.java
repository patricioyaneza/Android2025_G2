
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arreglos -  array
		
		// crear arreglo
		int [] numeros = { 5, 10, 15, 1, -10 };
		int [] numeros2 = new int [5];
		int [] numeros3;
		numeros3 = new int[10];
		
		// muestro o rescato el valor de un arreglo. indice 0
		System.out.println(numeros2[0]);
		// modificar el valor de el arreglo en el indice 0
		numeros2[0] = 100;
		System.out.println(numeros2[0]);
		// System.out.println(numeros2[5]); lanza una excepcion (error)
		
		System.out.println("Cant. de elementos: " + numeros2.length);
		System.out.println("Cant. de elementos: " + numeros3.length);
		
		// creacion de una matriz de 2 x 3
		int [][] matriz = { {1,2,3 }, {9,8,7} };
		
		// como puedo obtener el 9???
		
		System.out.println("Valor de la matriz: " + matriz[1][0]);
		System.out.println("Valor de la matriz: " + matriz[0][2]);
		
	}

}
