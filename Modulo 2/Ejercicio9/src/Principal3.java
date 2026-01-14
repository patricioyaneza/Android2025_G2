import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Crear una cuanta regresiva desde el valor que indique el usuario
 * utilizar for para mostrar la cuenta regresiva
 * 
 * 
 */
		Scanner scanner = new Scanner(System.in);
		int numero;

		System.out.print("Ingresa un numero para iniciar la cuenta regresiva: ");
		numero = scanner.nextInt();

		for (int i = numero; i >= 0; i--) {
		System.out.println(i);

			try {
				Thread.sleep(1000); // Pausa de 1 segundo (1000 milisegundos)
			} catch (InterruptedException e) {
				System.out.println("Error!");
			}

//			for(int x = -1000000000; x < 1000000000; x++);
		}

		System.out.println("Terminaste!");
		
	}

}
