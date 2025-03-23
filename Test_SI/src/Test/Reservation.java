package Test;

import java.time.LocalDateTime;

public class Reservation {

	private String IdResrvation;
	private String Nom_Employe;
	private LocalDateTime Date;
	private double Durée;
	private Batiment Batiment;
	
	
	public Reservation(String Nom_Employe, LocalDateTime date, double durée , Batiment Batiment) {
		
		Nom_Employe = Nom_Employe;
		Date = date;
		Durée = durée;
		this.Batiment = Batiment;
		
		
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

	public void setIdResrvation(String idResrvation) {
		IdResrvation = idResrvation;
	}

	public Batiment getBatiment() {
		return Batiment;
	}

	public void setBatiment(Batiment batiment) {
		Batiment = batiment;
	}
	
	public void IDreserv()
	{
		String[] Salle = getBatiment().getNomSalle().split(" ");
		String[] Batiments= getBatiment().getNom_Batiment().split(" ");
		
		setIdResrvation( Batiments[1] + Salle[1]);
	}
}
