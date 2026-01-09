
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = " Diego ";
		
		System.out.println("Contar caracteres   : " + nombre.length());
		
		System.out.println("Mayúsculas          : " + nombre.toUpperCase());
		System.out.println("Minúsculas          : " + nombre.toLowerCase());
		
		System.out.println("El nombre es        : " + nombre + ".");
		System.out.println("El nombre es        : " + nombre.trim() + ".");
		
		System.out.println("Juan \nPerez \nDiaz");
		
		
		String frase = "Somos el mejor pais de Chile";
		System.out.println("Contar caracteres   : " + frase.length());
		System.out.println("indexOf             : " + frase.indexOf("pais"));
		System.out.println("indexOf             : " + frase.indexOf("Perú"));
		System.out.println("indexOf             : " + frase.indexOf("e"));
		System.out.println("lastIndexOf         : " + frase.lastIndexOf("e"));
		System.out.println("charAt              : " + frase.charAt(15));
		
		// substring  2 sobrecarga
		System.out.println("Substring 1         : " + frase.substring(15));
		System.out.println("Substring 1         : " + frase.substring(15,19));
		
		
	}

}
