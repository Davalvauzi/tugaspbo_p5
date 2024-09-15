package pert3;

import kelasku.*;

public class Pert3 extends Dilan {

	private String name = "dafa"; 
	public String getNama() {
			return this.name;
	}
	
	protected String npm = "16518239032";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dilan dln = new Dilan();
		dln.info();
		
		Pert3 pert3 = new Pert3();
		System.out.println(pert3.npm);
	}
}
