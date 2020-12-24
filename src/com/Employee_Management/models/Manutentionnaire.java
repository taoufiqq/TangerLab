package com.Employee_Management.models;

public class Manutentionnaire extends Employe{
	
    private int nbrHeurs ;

	public int getNbrHeurs() {
		return nbrHeurs;
	}

	public void setNbrHeurs(int nbrHeurs) {
		this.nbrHeurs = nbrHeurs;
	}

	public Manutentionnaire(String lastName, String firstName, int age, String dateEntreeService,int nbrHeurs) {
		super(lastName, firstName, age, dateEntreeService);
		this.nbrHeurs=nbrHeurs;
		// TODO Auto-generated constructor stub
	}
	public Manutentionnaire() {
		
	}
   public double calculerSalaire() 
      {   
	      return nbrHeurs*50;	   
      }
   public String getTitle()
      {
          return "Le Manutentionnaire ";
      }
}
