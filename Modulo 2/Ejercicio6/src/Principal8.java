
public class Principal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// operadores logicos && y ||
		
        int nota = 150;  // 10 - 70
        
        if( nota < 10 || nota > 70)
        {
        		System.out.println("La nota no es válida");
        }
        else
        		System.out.println("La nota es valida");
		
        String usuario = "ANA";
        String clave = "12345";
        
        if(usuario.equals("ANA") && clave.equals("1234"))
        {
        		System.out.println("Bienvenido/a " + usuario);
        }
        else
        		System.out.println("Usuario y clave no coinciden.");
        
        
	}

}
