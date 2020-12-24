package com.Employee_Management.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Employee_Management.config.Confugiration;
import com.Employee_Management.models.Employe;
import com.Employee_Management.models.Manutentionnaire;
import com.Employee_Management.models.ManutentionnaireArisque;
import com.Employee_Management.models.Producteur;
import com.Employee_Management.models.ProducteurArisque;
import com.Employee_Management.models.Representant;
import com.Employee_Management.models.Vendeur;




public class EmployeController {

       Confugiration config;
       Producteur prod;
       Manutentionnaire manut;
       Vendeur vendeur;
       Representant representant;
       ManutentionnaireArisque manutARisque;
       ProducteurArisque prodARisque;
       
    
       
       public EmployeController() {
    	   
    	   prod = new Producteur();
    	   manut = new Manutentionnaire();
    	   vendeur = new Vendeur();
    	   representant = new Representant();
    	   manutARisque = new ManutentionnaireArisque();
    	   prodARisque = new ProducteurArisque();
    	   config= new Confugiration("jdbc:mysql://localhost:3306/gestion_personnel", "root", "");
    	   
       }

//   	---------------------------------------CRUD Employe Type "Vendeur"------------------------------------------
       
       
       public void ajouteVendeur(int id,String lastName,String firstName,int age,String dateEntreeService,double chiffreAffaire) throws SQLException {
    	   vendeur.setChiffreAffaire(chiffreAffaire);
    	

    		String sql = "insert into vendeur (id, lastName, firstName,age,dateEntreeService,chiffreAffaire,salaire_vendeur) values('"
    				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + chiffreAffaire+ "', '" + vendeur.calculerSalaire()+ "')";
    	    
    	    Connection conn = config.connect();
    	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
    		preparedStmt.execute();
       }
       public void updateVendeur(int id,String lastName,String firstName,int age,String dateEntreeService,double chiffreAffaire) throws SQLException {
    	   vendeur.setChiffreAffaire(chiffreAffaire);
    	   
       	String query = "UPDATE vendeur SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', chiffreAffaire = '" + chiffreAffaire + "', salaire_vendeur = '" + vendeur.calculerSalaire() + "' where id = '" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }
       public void deleteVendeur(int id) throws SQLException {
       	
       	String query = "DELETE FROM vendeur WHERE id ='" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }
       
//  	---------------------------------------CRUD Employe Type " Representant"------------------------------------------
       public void ajouteRepresentant(int id,String lastName,String firstName,int age,String dateEntreeService,double chiffreAffaire) throws SQLException {
    	 representant.setChiffreAffaire(chiffreAffaire);  

   		String sql = "insert into representant (id, lastName, firstName,age,dateEntreeService,chiffreAffaire,salaire_rep) values('"
   				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + chiffreAffaire+ "', '" + representant.calculerSalaire()+ "')";
   	    
   	    Connection conn = config.connect();
   	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
   		preparedStmt.execute();
      }
      public void updateRepresentant(int id,String lastName,String firstName,int age,String dateEntreeService,double chiffreAffaire) throws SQLException {
     	 representant.setChiffreAffaire(chiffreAffaire); 
      	String query = "UPDATE representant SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', chiffreAffaire = '" + chiffreAffaire + "', salaire_rep = '" + representant.calculerSalaire() + "' where id = '" + id + "'";
      	
  		    Connection conn = config.connect();
  	        PreparedStatement preparedStmt = conn.prepareStatement(query);
  	        preparedStmt.executeUpdate();
  }
      public void deleteRepresentant(int id) throws SQLException {
      	
      	String query = "DELETE FROM representant WHERE id ='" + id + "'";
      	
  		    Connection conn = config.connect();
  	        PreparedStatement preparedStmt = conn.prepareStatement(query);
  	        preparedStmt.executeUpdate();
  }
       
   
//  	---------------------------------------CRUD Employe Type "Producteur"------------------------------------------
       
       public void ajouteProducteur(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrUnites) throws SQLException {
    	prod.setNbrUnites(nbrUnites);   	   
   		String sql = "insert into producteur  (id, lastName, firstName,age,dateEntreeService,nbrUnites,salaire_prod) values('"
   				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + nbrUnites+ "', '" + prod.calculerSalaire() + "')";
   	    
   	    Connection conn = config.connect();
   	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
   		preparedStmt.execute();
      }
      public void updateProducteur(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrUnites) throws SQLException {
    	  prod.setNbrUnites(nbrUnites); 
      	String query = "UPDATE producteur SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', nbrUnites = '" + nbrUnites + "', salaire_prod = '" + prod.calculerSalaire() +"' where id = '" + id + "'";
      	
  		    Connection conn = config.connect();
  	        PreparedStatement preparedStmt = conn.prepareStatement(query);
  	        preparedStmt.executeUpdate();
  }
      public void deleteProducteur(int id) throws SQLException {
      	
      	String query = "DELETE FROM producteur WHERE id ='" + id + "'";
      	
  		    Connection conn = config.connect();
  	        PreparedStatement preparedStmt = conn.prepareStatement(query);
  	        preparedStmt.executeUpdate();
  }      
       
//	---------------------------------------CRUD Employe Type "Manutentionnaire"------------------------------------------      
       
      public void ajouteManutentionnaire(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrHeurs) throws SQLException {
    	  
   	   manut.setNbrHeurs(nbrHeurs);

     		String sql = "insert into manutentionnaire  (id, lastName, firstName,age,dateEntreeService,nbrHeurs,salaire_manut) values('"
     				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + nbrHeurs+ "','" + manut.calculerSalaire()+ "')";
     	    
     	    Connection conn = config.connect();
     	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
     		preparedStmt.execute();
        }
        public void updateManutentionnaire(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrHeurs) throws SQLException {
        	   manut.setNbrHeurs(nbrHeurs);
        	String query = "UPDATE manutentionnaire SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', nbrHeurs = '" + nbrHeurs +"', salaire_manut = '" + manut.calculerSalaire() + "' where id = '" + id + "'";
        	
    		    Connection conn = config.connect();
    	        PreparedStatement preparedStmt = conn.prepareStatement(query);
    	        preparedStmt.executeUpdate();
    }
        public void deleteManutentionnaire(int id) throws SQLException {
        	
        	String query = "DELETE FROM manutentionnaire WHERE id ='" + id + "'";
        	
    		    Connection conn = config.connect();
    	        PreparedStatement preparedStmt = conn.prepareStatement(query);
    	        preparedStmt.executeUpdate();
    }            
//  	---------------------------------------CRUD Employe Type "ProducteurARisque"------------------------------------------
        
        public void ajouteProducteurARisque(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrUnites) throws SQLException {
     	prodARisque.setNbrUnites(nbrUnites);   	   
    		String sql = "insert into producteur_arisque  (id, lastName, firstName,age,dateEntreeService,nbrUnites,salaire_prod_arisque) values('"
    				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + nbrUnites+ "', '" + prodARisque.calculerSalaire() + "')";
    	    
    	    Connection conn = config.connect();
    	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
    		preparedStmt.execute();
       }
       public void updateProducteurARisque(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrUnites) throws SQLException {
    	   prodARisque.setNbrUnites(nbrUnites); 
       	String query = "UPDATE producteur_arisque SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', nbrUnites = '" + nbrUnites + "', salaire_prod_arisque = '" + prodARisque.calculerSalaire() +"' where id = '" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }
       public void deleteProducteurARisque(int id) throws SQLException {
       	
       	String query = "DELETE FROM producteur_arisque WHERE id ='" + id + "'";
       	
   		    Connection conn = config.connect();
   	        PreparedStatement preparedStmt = conn.prepareStatement(query);
   	        preparedStmt.executeUpdate();
   }            
//    	---------------------------------------CRUD Employe Type "ManutentionnaireARisque"------------------------------------------      
        
        public void ajouteManutentionnaireARisque(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrHeurs) throws SQLException {
      	  
     	   manutARisque.setNbrHeurs(nbrHeurs);

       		String sql = "insert into manutentionnaire_arisque  (id, lastName, firstName,age,dateEntreeService,nbrHeurs,salaire_manut_arisque) values('"
       				+ id + "', '" + lastName + "', '" + firstName + "', '" + age + "', '" + dateEntreeService+ "', '" + nbrHeurs+ "','" + manutARisque.calculerSalaire()+ "')";
       	    
       	    Connection conn = config.connect();
       	    PreparedStatement preparedStmt = conn.prepareStatement(sql);
       		preparedStmt.execute();
          }
          public void updateManutentionnaireARisque(int id,String lastName,String firstName,int age,String dateEntreeService,int nbrHeurs) throws SQLException {
        	  manutARisque.setNbrHeurs(nbrHeurs);
          	String query = "UPDATE manutentionnaire_arisque SET " + "lastName = '" + lastName + "', firstName = '" + firstName + "', age = '" + age + "', dateEntreeService = '" + dateEntreeService + "', nbrHeurs = '" + nbrHeurs +"', salaire_manut_arisque = '" + manutARisque.calculerSalaire() + "' where id = '" + id + "'";
          	
      		    Connection conn = config.connect();
      	        PreparedStatement preparedStmt = conn.prepareStatement(query);
      	        preparedStmt.executeUpdate();
      }
          public void deleteManutentionnaireARisque(int id) throws SQLException {
          	
          	String query = "DELETE FROM manutentionnaire_arisque WHERE id ='" + id + "'";
          	
      		    Connection conn = config.connect();
      	        PreparedStatement preparedStmt = conn.prepareStatement(query);
      	        preparedStmt.executeUpdate();
      } 
       
//          public void afficherSalaires() {
//  	        for (int i = 0; i < listEmployes.size(); i++) {
//  	            System.out.println( " Salaire de : " + listEmployes.get(i).getName() + listEmployes.get(i).calculerSalaire() + " DH ");
//  	        }
//  	    } 
//       
//          ArrayList<Employe> listEmployes = new ArrayList<Employe>(); 
          
          public void afficherSalaires () throws SQLException {
          	
//      		ArrayList<Employe> listEmployes = new ArrayList<Employe>();
          	
      		String sql = "select * from vendeur, producteur, representant, manutentionnaire,manutentionnaire_arisque,producteur_arisque ";
      		
      		Connection conn = config.connect();
      		
      		Statement statement = conn.createStatement();
      		ResultSet result = statement.executeQuery(sql);

      		 while(result.next()) {
      			 
//      			+ result.getString("lastName") +" "+ result.getString("firstName") +" "
        	            System.out.println(" le salaire de : "+vendeur.getName()+" "+result.getDouble("salaire_vendeur")+" DH \n"+
        	            ""+" le salaire de : "+prod.getName()+" "+result.getDouble("salaire_prod")+" DH \n"+
        	            ""+" le salaire de : "+representant.getName()+" "+ result.getDouble("salaire_rep")+" DH \n"+
        	            ""+" le salaire de : "+manut.getName()+" "+result.getDouble("salaire_manut")+" DH \n"+
        	            ""+" le salaire de : "+manutARisque.getName()+" "+result.getDouble("salaire_manut_arisque")+" DH \n"+
        	            ""+" le salaire de : "+prodARisque.getName()+" "+result.getDouble("salaire_prod_arisque")+" DH \n"); 
      			 

 

      		 }
      			
      	
      }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
