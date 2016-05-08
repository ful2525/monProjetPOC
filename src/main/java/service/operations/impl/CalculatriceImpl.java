package service.operations.impl;

import service.operations.ICalculatrice;

public class CalculatriceImpl implements ICalculatrice {

	public int addition(int pOp1, int pOp2) {
		// TODO Implémenter le service
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public int soustraction(int pOp1, int pOp2) {
		
		return pOp1 - pOp2;
	}

	/**
	 * {@inheritDoc}
	 */
	public int division(int pDividende, int pDiviseur) {
		
		//Fix : Prise en compte de la division par 0.
		int vRes = 0;
		if ( pDiviseur != 0 ) {
		
			vRes = pDividende/pDiviseur;
		}
		
		return vRes;
	}

}
