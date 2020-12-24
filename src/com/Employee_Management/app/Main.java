package com.Employee_Management.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.Employee_Management.controllers.EmployeController;
import com.Employee_Management.models.Producteur;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		ArrayList<Producteur> listP = new ArrayList<Producteur>();
		
		
		
		
		  boolean var = true;
			while (var) {
				
				System.out.println("*********************Bienvenu dans la Gestion des Employee*********************");
		        System.out.println("Menu Principal");
		        System.out.println("1- Gestion des Employees Commercial");
		        System.out.println("2- Gestion Producteur");
		        System.out.println("3- Gestion ProducteurARisque");
		        System.out.println("4- Gestion Manutentionnaire");
		        System.out.println("5- Gestion ManutentionnaireARisque");
		        System.out.println("6- Afficher salaire ");
		        System.out.println("7 Quitter le programme");
		        
		        System.out.println("Choix :");
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        int choix = scanner.nextInt();
		        
		    	boolean var1 = true;
		        boolean var4 = true;
			    boolean var5 = true;
			    
		        switch (choix) {
				case 1:
				
					while (var1) {
						
						System.out.println("*********************Gestion des Employees Commercial*********************");
					    System.out.println("1- voulez-vous gérer les Vendeurs ?");
				        System.out.println("2- voulez-vous gérer les Representants ?");
				        System.out.println("3- Quitter le Menu Commercial");
				        
				        System.out.println("Choix :");
				      
				        int choixCommercial = scanner.nextInt();
				        
				        boolean var2 = true;
				        boolean var3 = true;
				     
				        switch (choixCommercial) {
						case 1:
							
							
							while (var2) {
								    System.out.println("*******************Gestion des Vendeurs*****************");
								    System.out.println("1- Ajouter Vendeur");
							        System.out.println("2- Modifier Vendeur");
							        System.out.println("3- Supprimer Vendeur");
							        System.out.println("4- Quitter le Menu des Vendeurs");
								
							        System.out.println("Choix :");
							        
							        int choixVendeur = scanner.nextInt();
							        switch (choixVendeur) {
							        
							        case 1:
							        	 System.out.println("Ajouter Vendeur");
										 
										 System.out.println("ID :");
										 int id = scanner.nextInt ();
										 
										 System.out.println("Nom :");
										 String lastName = scanner.next();
										 
										 System.out.println("Prenom :");
										 String firstName = scanner.next();
										 
										 System.out.println("age :");
										 int age = scanner.nextInt();
										 
										 System.out.println("Date d'entree en Service :");
										 String dateEntreeService = scanner.next();
										 							 
										 System.out.println("Chaiffre d'affaire :");
										 Double chiffreAffaire = scanner.nextDouble();
										 
			                             EmployeController addVenduer = new EmployeController();
			                             
			                      
					
			                             addVenduer.ajouteVendeur(id, lastName, firstName, age, dateEntreeService, chiffreAffaire);	
										 
										 System.out.println("Vendeur Bien Ajouté");
							        	break;
							        	
							        case 2:
							        	 System.out.println("Modifier Vendeur");
										 
			                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
										 int idUpdate = scanner.nextInt ();
										 
										 System.out.println(" Entrer Nouveau Nom :");
										 String newLastName = scanner.next();
										 
										 System.out.println("Entrer Nouveau Prenom :");
										 String newFirstName = scanner.next();
										 
										 System.out.println("Entrer Nouveau age :");
										 int newAge = scanner.nextInt();
										 
										 System.out.println("Entrer Nouveau Date d'entree en Service :");
										 String newDateEntreeService = scanner.next();
										 							 
										 System.out.println("Entrer Nouveau Chaiffre d'affaire :");
										 Double newChiffreAffaire = scanner.nextDouble();
										 
			                             EmployeController updateVendeur = new EmployeController();
			                             
			                             
			                             
			                             updateVendeur.updateVendeur(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newChiffreAffaire);
					
			                             System.out.println("vendeur Bien Modifier");
										 
							        	break;
							        case 3:
							        	 System.out.println("Supprimer un Vendeur :");
										 
										 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
										 int idSup = scanner.nextInt ();
										 
										 
										  
										  EmployeController deleteVendeur = new EmployeController();
										  deleteVendeur.deleteVendeur(idSup);	
											 
											 System.out.println("Vendeur Bien Supprimé");
							        	break;
							    
							        case 4:
							        	System.out.println("Vous avez Quitter le Menu des Vendeur");
					                 	var2=false;
					                	var3=false;
					                	var4=false;
					                	var5=false;
					                    var1=true;
					                 	break;
					
										default:
											System.out.println("Choix invalid!!!!!!!!!!!");
											break;

							         }
							     
							     }
						case 2:
				
							while (var3) {
								    System.out.println("*******************Gestion des Representants*****************");
								    System.out.println("1- Ajouter Representant");
							        System.out.println("2- Modifier Representant");
							        System.out.println("3- Supprimer Representant");
							        System.out.println("4- Quitter le Menu des Representants");
								
							        System.out.println("Choix :");
							        
							        int choixRepresentant = scanner.nextInt();
							        switch (choixRepresentant) {
							        
							        case 1:
							        	 System.out.println("Ajouter Representant");
										 
										 System.out.println("ID :");
										 int id = scanner.nextInt ();
										 
										 System.out.println("Nom :");
										 String lastName = scanner.next();
										 
										 System.out.println("Prenom :");
										 String firstName = scanner.next();
										 
										 System.out.println("age :");
										 int age = scanner.nextInt();
										 
										 System.out.println("Date d'entree en Service :");
										 String dateEntreeService = scanner.next();
										 							 
										 System.out.println("Chaiffre d'affaire :");
										 Double chiffreAffaire = scanner.nextDouble();
										 
			                             EmployeController addRepresentant = new EmployeController();
			                             
			                            
					
			                             addRepresentant.ajouteRepresentant(id, lastName, firstName, age, dateEntreeService, chiffreAffaire);
										 
										 System.out.println("Representant Bien Ajouté");
							        	break;
							        	
							        case 2:
							        	 System.out.println("Modifier Representant");
										 
			                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
										 int idUpdate = scanner.nextInt ();
										 
										 System.out.println(" Entrer Nouveau Nom :");
										 String newLastName = scanner.next();
										 
										 System.out.println("Entrer Nouveau Prenom :");
										 String newFirstName = scanner.next();
										 
										 System.out.println("Entrer Nouveau age :");
										 int newAge = scanner.nextInt();
										 
										 System.out.println("Entrer Nouveau Date d'entree en Service :");
										 String newDateEntreeService = scanner.next();
										 							 
										 System.out.println("Entrer Nouveau Chaiffre d'affaire :");
										 Double newChiffreAffaire = scanner.nextDouble();
										 
			                             EmployeController updateRepresentant = new EmployeController();
			                             
			                            
			                             
			                             updateRepresentant.updateRepresentant(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newChiffreAffaire);;
					
			                             System.out.println("Representant Bien Modifier");
										 
							        	break;
							        case 3:
							        	 System.out.println("Supprimer un Representant :");
										 
										 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
										 int idSup = scanner.nextInt ();
										 
										 
										  
										  EmployeController deleteRepresentant = new EmployeController();
										  deleteRepresentant.deleteRepresentant(idSup);
											 
											 System.out.println("Representant Bien Supprimé");
							        	break;
							        case 4:
							        	System.out.println("Vous avez Quitter le Menu des Representant");
					                 	var3=false;
					                	var4=false;
					                	var5=false;
					                    var1=true;
					                 
					                 	break;
					
										default:
											System.out.println("Choix invalid!!!!!!!!!!!");
											break;
							        }
							      }
						case 3:
							System.out.println("Vous avez Quitter le Menu des Commercial");
							var1= false;
							var4=false;
		                	var5=false;
		                    var = true;
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
							 }
				        
				        }

				   case 2:

					   while (var4) {
						    System.out.println("*******************Gestion des Producteurs*****************");
						    System.out.println("1- Ajouter Producteur");
					        System.out.println("2- Modifier Producteur");
					        System.out.println("3- Supprimer Producteur");
					        System.out.println("4- Quitter le Menu des Producteurs");
						
					        System.out.println("Choix :");
					        
					        int choixProducteur = scanner.nextInt();
					        switch (choixProducteur) {
					        
					        
					        case 1:
					        	if(listP.size() > 1) {
						        	
						        	 System.out.println("Vous ne pouvez pas  Ajouter un autre Producteur");
						        }else {
						        	
					        	 System.out.println("Ajouter Producteur");
								 
								 System.out.println("ID :");
								 int id = scanner.nextInt ();
								 
								 System.out.println("Nom :");
								 String lastName = scanner.next();
								 
								 System.out.println("Prenom :");
								 String firstName = scanner.next();
								 
								 System.out.println("age :");
								 int age = scanner.nextInt();
								 
								 System.out.println("Date d'entree en Service :");
								 String dateEntreeService = scanner.next();
								 							 
								 System.out.println("Nombre d'Unites produit :");
								 int nbrUnites = scanner.nextInt();
								 
	                             EmployeController addProducteur = new EmployeController();

			
	                             addProducteur.ajouteProducteur(id, lastName, firstName, age, dateEntreeService, nbrUnites);	
								 
								 System.out.println("Producteur Bien Ajouté");
					        	break;
						        }
					        case 2:
					        	 System.out.println("Modifier Producteur");
								 
	                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
								 int idUpdate = scanner.nextInt ();
								 
								 System.out.println(" Entrer Nouveau Nom :");
								 String newLastName = scanner.next();
								 
								 System.out.println("Entrer Nouveau Prenom :");
								 String newFirstName = scanner.next();
								 
								 System.out.println("Entrer Nouveau age :");
								 int newAge = scanner.nextInt();
								 
								 System.out.println("Entrer Nouveau Date d'entree en Service :");
								 String newDateEntreeService = scanner.next();
								 							 
								 System.out.println("Entrer Nouveau Nombre d'Unites :");
								 int newNbrUnites = scanner.nextInt();
								 
	                             EmployeController updateProducteur = new EmployeController();
	                             
	                             
	                             updateProducteur.updateProducteur(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrUnites);
			
	                             System.out.println("Producteur Bien Modifier");
								 
					        	break;
					        case 3:
					        	 System.out.println("Supprimer un Producteur :");
								 
								 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
								 int idSup = scanner.nextInt ();
					
								 EmployeController deleteProducteur = new EmployeController();
								 deleteProducteur.deleteProducteur(idSup);
							     System.out.println("Producteur Bien Supprimé");
					        	break;
					        case 4:
					        	System.out.println("Vous avez Quitter le Menu des Producteurs");
			                 	var4=false;	
			                	var5=false;
			                    var1=true;
			                 
			                 	break;
			
								default:
									System.out.println("Choix invalid!!!!!!!!!!!");
									break;
					        }
					      }
				   case 3:

					   while (var4) {
						    System.out.println("*******************Gestion des ProducteursARisque*****************");
						    System.out.println("1- Ajouter ProducteurARisque");
					        System.out.println("2- Modifier ProducteurARisque");
					        System.out.println("3- Supprimer ProducteurARisque");
					        System.out.println("4- Quitter le Menu des ProducteurARisque");
						
					        System.out.println("Choix :");
					        
					        int choixProducteur = scanner.nextInt();
					        switch (choixProducteur) {
					        
					        
					        case 1:
					        	if(listP.size() > 1) {
						        	
						        	 System.out.println("Vous ne pouvez pas  Ajouter un autre ProducteurARisque");
						        }else {
						        	
					        	 System.out.println("Ajouter ProducteurARisque");
								 
								 System.out.println("ID :");
								 int id = scanner.nextInt ();
								 
								 System.out.println("Nom :");
								 String lastName = scanner.next();
								 
								 System.out.println("Prenom :");
								 String firstName = scanner.next();
								 
								 System.out.println("age :");
								 int age = scanner.nextInt();
								 
								 System.out.println("Date d'entree en Service :");
								 String dateEntreeService = scanner.next();
								 							 
								 System.out.println("Nombre d'Unites produit :");
								 int nbrUnites = scanner.nextInt();
								 
	                             EmployeController addProducteurARisque = new EmployeController();

			
	                             addProducteurARisque.ajouteProducteurARisque(id, lastName, firstName, age, dateEntreeService, nbrUnites);	
								 
								 System.out.println("ProducteurARisque Bien Ajouté");
					        	break;
						        }
					        case 2:
					        	 System.out.println("Modifier ProducteurARisque");
								 
	                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
								 int idUpdate = scanner.nextInt ();
								 
								 System.out.println(" Entrer Nouveau Nom :");
								 String newLastName = scanner.next();
								 
								 System.out.println("Entrer Nouveau Prenom :");
								 String newFirstName = scanner.next();
								 
								 System.out.println("Entrer Nouveau age :");
								 int newAge = scanner.nextInt();
								 
								 System.out.println("Entrer Nouveau Date d'entree en Service :");
								 String newDateEntreeService = scanner.next();
								 							 
								 System.out.println("Entrer Nouveau Nombre d'Unites :");
								 int newNbrUnites = scanner.nextInt();
								 
	                             EmployeController updateProducteurARisque = new EmployeController();
	                             
	                             
	                             updateProducteurARisque.updateProducteurARisque(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrUnites);
			
	                             System.out.println("ProducteurARisque Bien Modifier");
								 
					        	break;
					        case 3:
					        	 System.out.println("Supprimer un ProducteurARisque :");
								 
								 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
								 int idSup = scanner.nextInt ();
					
								 EmployeController deleteProducteurARisque = new EmployeController();
								 deleteProducteurARisque.deleteProducteurARisque(idSup);
							     System.out.println("ProducteurARisque Bien Supprimé");
					        	break;
					        case 4:
					        	System.out.println("Vous avez Quitter le Menu des ProducteursARisque");
			                 	var4=false;	
			                	var5=false;
			                    var1=true;
			                 
			                 	break;
			
								default:
									System.out.println("Choix invalid!!!!!!!!!!!");
									break;
					        }
					      }
				   case 4:
					  
					   while (var5) {
						    System.out.println("*******************Gestion des Manutentionnaires*****************");
						    System.out.println("1- Ajouter Manutentionnaire");
					        System.out.println("2- Modifier Manutentionnaire");
					        System.out.println("3- Supprimer Manutentionnaire");
					        System.out.println("4- Quitter le Menu des Manutentionnaires");
						
					        System.out.println("Choix :");
					        
					        int choixManutentionnaire = scanner.nextInt();
					        switch (choixManutentionnaire) {
					        
					        case 1:
					        	 System.out.println("Ajouter Manutentionnaire");
								 
								 System.out.println("ID :");
								 int id = scanner.nextInt ();
								 
								 System.out.println("Nom :");
								 String lastName = scanner.next();
								 
								 System.out.println("Prenom :");
								 String firstName = scanner.next();
								 
								 System.out.println("age :");
								 int age = scanner.nextInt();
								 
								 System.out.println("Date d'entree en Service :");
								 String dateEntreeService = scanner.next();
								 							 
								 System.out.println("Nombre d'Heurs :");
								 int nbrHeurs = scanner.nextInt();
								 
	                             EmployeController addManutentionnaire = new EmployeController();

			
	                             addManutentionnaire.ajouteManutentionnaire(id, lastName, firstName, age, dateEntreeService, nbrHeurs);	
								 
								 System.out.println("Manutentionnaire Bien Ajouté");
					        	break;
					        	
					        case 2:
					        	 System.out.println("Modifier Manutentionnaire");
								 
	                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
								 int idUpdate = scanner.nextInt ();
								 
								 System.out.println(" Entrer Nouveau Nom :");
								 String newLastName = scanner.next();
								 
								 System.out.println("Entrer Nouveau Prenom :");
								 String newFirstName = scanner.next();
								 
								 System.out.println("Entrer Nouveau age :");
								 int newAge = scanner.nextInt();
								 
								 System.out.println("Entrer Nouveau Date d'entree en Service :");
								 String newDateEntreeService = scanner.next();
								 							 
								 System.out.println("Entrer Nouveau Nombre d'Heurs :");
								 int newNbrHeurs = scanner.nextInt();
								 
	                             EmployeController updateManutentionnaire = new EmployeController();
	                             
	                             
	                             updateManutentionnaire.updateManutentionnaire(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrHeurs);
			
	                             System.out.println("Manutentionnaire Bien Modifier");
								 
					        	break;
					        case 3:
					        	 System.out.println("Supprimer un Manutentionnaire :");
								 
								 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
								 int idSup = scanner.nextInt ();
					
								 EmployeController deleteManutentionnaire = new EmployeController();
								 deleteManutentionnaire.deleteManutentionnaire(idSup);
							     System.out.println("Manutentionnaire Bien Supprimé");
					        	break;
					        case 4:
					        	System.out.println("Vous avez Quitter le Menu des Manutentionnaire");
			                 	var5=false;  
			                    var1=true;
			                 
			                 	break;
			
								default:
									System.out.println("Choix invalid!!!!!!!!!!!");
									break;
					        }
					      }
					   break;
				   case 5:
					   while (var5) {
						    System.out.println("*******************Gestion des ManutentionnairesARisque*****************");
						    System.out.println("1- Ajouter ManutentionnaireARisque");
					        System.out.println("2- Modifier ManutentionnaireARisque");
					        System.out.println("3- Supprimer ManutentionnaireARisque");
					        System.out.println("4- Quitter le Menu des ManutentionnairesARisque");
						
					        System.out.println("Choix :");
					        
					        int choixManutentionnaire = scanner.nextInt();
					        switch (choixManutentionnaire) {
					        
					        case 1:
					        	 System.out.println("Ajouter ManutentionnaireARisque");
								 
								 System.out.println("ID :");
								 int id = scanner.nextInt ();
								 
								 System.out.println("Nom :");
								 String lastName = scanner.next();
								 
								 System.out.println("Prenom :");
								 String firstName = scanner.next();
								 
								 System.out.println("age :");
								 int age = scanner.nextInt();
								 
								 System.out.println("Date d'entree en Service :");
								 String dateEntreeService = scanner.next();
								 							 
								 System.out.println("Nombre d'Heurs :");
								 int nbrHeurs = scanner.nextInt();
								 
	                             EmployeController addManutentionnaireARisque = new EmployeController();

			
	                             addManutentionnaireARisque.ajouteManutentionnaireARisque(id, lastName, firstName, age, dateEntreeService, nbrHeurs);	
								 
								 System.out.println("ManutentionnaireARisque Bien Ajouté");
					        	break;
					        	
					        case 2:
					        	 System.out.println("Modifier ManutentionnaireARisque");
								 
	                             System.out.println("Entrez l'ID de l'employé que vous souhaitez Modifier :");
								 int idUpdate = scanner.nextInt ();
								 
								 System.out.println(" Entrer Nouveau Nom :");
								 String newLastName = scanner.next();
								 
								 System.out.println("Entrer Nouveau Prenom :");
								 String newFirstName = scanner.next();
								 
								 System.out.println("Entrer Nouveau age :");
								 int newAge = scanner.nextInt();
								 
								 System.out.println("Entrer Nouveau Date d'entree en Service :");
								 String newDateEntreeService = scanner.next();
								 							 
								 System.out.println("Entrer Nouveau Nombre d'Heurs :");
								 int newNbrHeurs = scanner.nextInt();
								 
	                             EmployeController updateManutentionnaireARisque = new EmployeController();
	                             
	                             
	                             updateManutentionnaireARisque.updateManutentionnaireARisque(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrHeurs);
			
	                             System.out.println("ManutentionnaireARisque Bien Modifier");
								 
					        	break;
					        case 3:
					        	 System.out.println("Supprimer un ManutentionnaireARisque :");
								 
								 System.out.println("Entrez l'ID de l'employé que vous souhaitez supprimer :");
								 int idSup = scanner.nextInt ();
					
								 EmployeController deleteManutentionnaireARisque = new EmployeController();
								 deleteManutentionnaireARisque.deleteManutentionnaireARisque(idSup);
							     System.out.println("ManutentionnaireARisque Bien Supprimé");
					        	break;
					        case 4:
					        	System.out.println("Vous avez Quitter le Menu des ManutentionnaireARisque");
			                 	var5=false;  
			                    var1=true;
			                 
			                 	break;
			
								default:
									System.out.println("Choix invalid!!!!!!!!!!!");
									break;
					        }
					      }
					   break;
				   case 6:
					   EmployeController afficheSalaire = new EmployeController();
					   afficheSalaire.afficherSalaires();
					   break;
				   case 7:
						System.out.println("Vous avez Quitter le Menu Principale");
						var=true;
					   break;
				   default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
	     }     	    	 
	  }
			
   }
}
