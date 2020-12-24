package com.Employee_Management.models;

public class Vendeur extends Commercial{

	public Vendeur(String lastName, String firstName, int age, String dateEntreeService, double chiffreAffaire) {
		super(lastName, firstName, age, dateEntreeService, chiffreAffaire);
		// TODO Auto-generated constructor stub
	}

	public Vendeur() {
		
	}

	public double calculerSalaire() {
		return (0.2 * getChiffreAffaire()) + 1500;
		 
	 }

	  public String getTitle()
      {
          return "Le Vendeur ";
      }
}
