package service.operations;

public interface ICalculatrice {

	int addition(final int pOp1, final int pOp2);
	
	/**
	 * Permet d'effectuer une soustraction.
	 * @param pOp1 Opérateur 1.
	 * @param pOp2 Opérateur 2.
	 * @return int le résultat de la soustraction.
	 */	
	int soustraction (final int pOp1, final int pOp2);
	
}
