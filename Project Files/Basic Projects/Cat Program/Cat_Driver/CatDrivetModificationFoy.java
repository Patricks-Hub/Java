
/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 14, 2025  
*/// Cat Driver Module 04 Update 


package Cat_Driver;

import Cat_Model.CatModificationFoy;

public class CatDrivetModificationFoy {

	public static void main(String[] args) {
		CatModificationFoy toasted = new CatModificationFoy("Toasted",14,15.6);
		toasted.updateisAlive();
		toasted.printInfo();
		
		CatModificationFoy Tastropy = new CatModificationFoy("Tastropy",1,10.6);
		Tastropy.printInfo();
		Tastropy.updateFixed();
		Tastropy.printInfo();
		Tastropy.eat();
		Tastropy.printInfo();
		Tastropy.play();
		Tastropy.printInfo();
		

	}
}

