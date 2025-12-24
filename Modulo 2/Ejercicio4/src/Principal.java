
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int B = 20;
		int C = 30;
		int D = 40;
		
		B = C;
		C = A;
		A = D;
		D = B;
		B++; // ++B   --B   B--    
		
		System.out.println(A + " " + B + " " + C + " " + D);
		
		
	}

}
