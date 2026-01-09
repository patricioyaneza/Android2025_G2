import java.util.Scanner;

public class Principal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 9:
		/*
		 * Solicitar 3 notas, promediarlos y señalar si aprobó o no.
		 * Adicionalmente si la nota es superior o igual a 30 y solo tiene 1 rojo
		 * señalar que puede dar un examen de repechaje
		 * 
		 * 	si promedio igual o superior a 40 aprueba
		 *  20 40 30  -> sin examen y reprobó
		 *  10 50 40  -> puede dar el examen
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("REGISTRE NOTAS");
		System.out.print("nota 1: ");
		int n1 = entrada.nextInt();
		System.out.print("nota 2: ");
		int n2 = entrada.nextInt();
		System.out.print("nota 3: ");
		int n3 = entrada.nextInt();
		int promedio = (n1 + n2 + n3) / 3;

		// Contador
		int rojos = 0;
		if (n1 < 40) rojos++;
		if (n2 < 40) rojos++;
		if (n3 < 40) rojos++;

		System.out.println("Promedio final: " + promedio);

		// Aprobo
		if (promedio >= 40) {
			System.out.println("Resultado: APROBADO");
		}
		// Repechaje
		else if (promedio >= 30 && rojos == 1) {
			System.out.println("ESTADO: REPROBADO (Pero puede dar exámen de REPECHAJE)");
		}
		// Reprobo
		else if (promedio < 30 || rojos > 1) {
			System.out.println("Resultado: REPROBADO");
		}

	}

}
