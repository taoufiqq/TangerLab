package com.Employee_Management.models;

public class ProducteurArisque extends Producteur implements Arisque{

	public ProducteurArisque(String lastName, String firstName, int age, String dateEntreeService, int nbrUnites) {
		super(lastName, firstName, age, dateEntreeService, nbrUnites);
		// TODO Auto-generated constructor stub
	}
	public ProducteurArisque() {
		
	}
	   public double calculerSalaire() 
	      {   
		      return super.calculerSalaire()+prime;	   
	      }
		 public String getTitle()
	      {
	          return "Le Producteur ARisque ";
	      } 
}
