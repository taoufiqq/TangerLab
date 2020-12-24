package com.Employee_Management.models;

public class Producteur extends Employe{
    private int nbrUnites;

	public int getNbrUnites() {
		return nbrUnites;
	}

	public void setNbrUnites(int nbrUnites) {
		this.nbrUnites = nbrUnites;
	}

	public Producteur(String lastName, String firstName, int age, String dateEntreeService,int nbrUnites) {
		super(lastName, firstName, age, dateEntreeService);
		this.nbrUnites=nbrUnites;
		// TODO Auto-generated constructor stub
	}
	 public Producteur() {
		// TODO Auto-generated constructor stub
	}

	public  double calculerSalaire() 
	      {
		      return nbrUnites*5;
	      }
	 public String getTitle()
	      {
	          return "Le Producteur ";
	      }

}
