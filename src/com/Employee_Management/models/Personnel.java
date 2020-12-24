package com.Employee_Management.models;

import java.util.ArrayList;



public class Personnel {

	ArrayList<Employe> listEmployes = new ArrayList<Employe>();
	
	public String addEmploye(Employe e) {
		try {
			listEmployes.add(e);
			return "Employe Added Successfully";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
	  public void afficherSalaires() {
	        for (int i = 0; i < listEmployes.size(); i++) {
	            System.out.println( " Salaire de : " + listEmployes.get(i).getName() + listEmployes.get(i).calculerSalaire() + " DH ");
	        }
	    }
	
	  public double salaireMoyen() {
	        double somme = 0.0;
	        for (int i = 0; i < listEmployes.size(); i++) {
	            somme += listEmployes.get(i).calculerSalaire();
	        }
	        return somme / listEmployes.size();
	    }
}
