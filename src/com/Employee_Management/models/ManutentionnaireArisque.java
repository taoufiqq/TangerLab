package com.Employee_Management.models;

public class ManutentionnaireArisque extends Manutentionnaire implements Arisque{

	public ManutentionnaireArisque(String lastName, String firstName, int age, String dateEntreeService, int nbrHeurs) {
		super(lastName, firstName, age, dateEntreeService, nbrHeurs);
		// TODO Auto-generated constructor stub
	}
	public ManutentionnaireArisque() {
		
	}
	   public double calculerSalaire() 
	      {   
		      return super.calculerSalaire()+prime;	   
	      }
	   public String getTitle()
	      {
	          return "Le Manutentionnaire ARisque ";
	      }
}
