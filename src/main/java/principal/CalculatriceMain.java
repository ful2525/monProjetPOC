package principal;

import service.operations.ICalculatrice;
import service.operations.impl.CalculatriceImpl;

public class CalculatriceMain {

	private static ICalculatrice calculatrice;
	
	
	public static void main(String[] args) {
		
		calculatrice = new CalculatriceImpl();

		System.out.println(calculatrice.addition(10, 0));
		
		//TATTOO-696
		System.out.println(calculatrice.soustraction(10, 5));
		
		//Correctif bug pour release v1.0.0
		System.out.println(calculatrice.division(10, 5));

	
	}

}
