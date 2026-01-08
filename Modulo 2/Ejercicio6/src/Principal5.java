
public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sentencia switch
		int dia = 8; // lunes = 1 ... domingo = 7
		
		switch(dia)
		{
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Día no válido.");
		}
		
		
		
		System.out.println("======= Fin de la aplicación =========");
	}

}
