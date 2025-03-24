package Test;

import java.time.LocalDateTime;

public class Reservation {

	private String IdResrvation;
	private String Nom_Employe;
	private LocalDateTime Date;
	private double Durée;
	private Salle salle;
	
	
	
	public Reservation(String Nom_Employe, LocalDateTime date, double durée , Salle salle ) {
		
		Nom_Employe = Nom_Employe;
		Date = date;
		Durée = durée;
		this.salle=salle;
		
		
		
	}

	public String getNom_Employe() {
		return Nom_Employe;
	}

	public void setNom_Employe(String nom_Employe) {
		Nom_Employe = nom_Employe;
	}

	public LocalDateTime getDate() {
		return Date;
	}

	public void setDate(LocalDateTime date) {
		Date = date;
	}

	public double getDurée() {
		return Durée;
	}

	public void setDurée(double durée) {
		Durée = durée;
	}

	

	public String getIdResrvation() {
		return IdResrvation;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public void setIdResrvation(String idResrvation) {
		IdResrvation = idResrvation;
	}

	public void selectID(Salle salle) throws SalleNotExist
	{
		 Batiment batiment = salle.getBatiment();
		if (!batiment.getSalles().contains(salle)) { 
	        throw new SalleNotExist("Aucune salle trouvée pour ce bâtiment.");
	    }
	
		else
		{
			for(Salle salles: batiment.getSalles())
			{
				if(salle.getNom_Salle().equals(salles.getNom_Salle()))
				{
					String[] Salle = salle.getNom_Salle().split(" ");
					String[] Batiment = batiment.getNom().split(" ");
					 String salleNum = Salle[Salle.length - 1]; 
			            String batimentCode = Batiment[Batiment.length - 1];
					IdResrvation = salleNum + batimentCode ;
					break;
				}
			}
		}
	}	
	
		
	}
	
	
	

