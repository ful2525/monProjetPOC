package principal;

import service.operations.ICalculatrice;
import service.operations.impl.CalculatriceImpl;

public class CalculatriceMain {

	private static ICalculatrice calculatrice;
	
	
	public static void main(String[] args) {
		
		calculatrice = new CalculatriceImpl();

		System.out.println(calculatrice.addition(10, 0));
		
	}

}
