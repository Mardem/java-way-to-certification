package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		 double temp = 86;
		 final double FATOR = 5.0/9.0;
		 final int AJUSTE = 32;
		 final double result = (temp - AJUSTE) * FATOR;
		 
		 System.out.println(result);		 
	}
}
