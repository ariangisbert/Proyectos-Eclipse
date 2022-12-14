package funcions3;
import java.util.*;

public class funcions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero1 = teclado.nextInt();
		
		System.out.print("Introduce otro: ");
		int numero2 = teclado.nextInt();
		
		
		int numeroMayor = mayor(numero1,numero2);
		
		
		if(numeroMayor==(numero1+numero2)) {
			
			
			System.out.println("Ambos números son iguales.");
			
			
		}else {
			
			
			System.out.println("El número mayor es "+numeroMayor+".");
			
		}
		
		
		
		
	}

	
	
	public static int mayor(int numero1, int numero2) {
		
		int numeroMayor = 0;
		
		if(numero1>numero2) {
			
			numeroMayor = numero1;
			
		}else if(numero2>numero1) {
			
			numeroMayor = numero2;
			
		}else if(numero1==numero2) {
			
			numeroMayor = numero1+numero2;
			
		}
		
		return numeroMayor;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
