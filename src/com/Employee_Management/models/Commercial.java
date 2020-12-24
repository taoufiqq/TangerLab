package com.Employee_Management.models;

public abstract class Commercial extends Employe{
	
	
	private double chiffreAffaire;

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Commercial(String lastName, String firstName, int age, String dateEntreeService,double chiffreAffaire) {
		super(lastName, firstName, age, dateEntreeService);
		this.chiffreAffaire=chiffreAffaire;
		// TODO Auto-generated constructor stub
	}
	public Commercial() {
		
	}
	

}
