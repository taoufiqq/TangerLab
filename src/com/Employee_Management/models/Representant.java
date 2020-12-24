package com.Employee_Management.models;

public class Representant extends Commercial{

	
	public Representant(String lastName, String firstName, int age, String dateEntreeService, double chiffreAffaire) {
		super(lastName, firstName, age, dateEntreeService, chiffreAffaire);
		// TODO Auto-generated constructor stub
	}
	public Representant() {
		
	}
    public double calculerSalaire() {
			return (0.2 * getChiffreAffaire()) + 2500;
			 
		 }

	  public String getTitle()
      {
          return "Le representant";
      }
	
	 
}
