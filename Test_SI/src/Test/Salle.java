package Test;

import java.util.List;

public class Salle {
	 private Batiment batiment;
	 private String Nom_Salle;
	
	 public Salle(Batiment batiment)
	 {
		 this.Nom_Salle=Nom_Salle;
		 this.batiment=batiment;
	 }
	 

	
	public Batiment getBatiment() {
		return batiment;
	}
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}



	public String getNom_Salle() {
		return Nom_Salle;
	}



	public void setNom_Salle(String nom_Salle) {
		Nom_Salle = nom_Salle;
	}
	
	
}
