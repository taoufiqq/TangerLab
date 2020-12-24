package com.Employee_Management.models;

public abstract class Employe {

	    private String lastName;
	    private String firstName;
	    private int age;
	    private String dateEntreeService;
	    
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDateEntreeService() {
			return dateEntreeService;
		}
		public void setDateEntreeService(String dateEntreeService) {
			this.dateEntreeService = dateEntreeService;
		}
		

		public Employe(String lastName, String firstName, int age, String dateEntreeService) {
			super();
			this.lastName = lastName;
			this.firstName = firstName;
			this.age = age;
			this.dateEntreeService = dateEntreeService;
		}
		public Employe() {
			
		}
		public String getTitle()
	        {
	            return "L'employé " ;
	        }

	    public String getName() {
	        return getTitle() + firstName + " " + lastName;
	    }
	    
	    public abstract double calculerSalaire();
	    
		@Override
		public String toString() {
			return "lastName:" + lastName + "\nfirstName:" + firstName + "\nage:" + age
					+ "\ndateEntreeService:" + dateEntreeService ;
		}
	    
	    
}
