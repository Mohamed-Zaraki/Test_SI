package Test;

public class Batiment {

	private String Nom_Batiment;
	private  int nbrMax;
	private String NomSalle;
	public Batiment(String Nom_Batiment , int nbrMax)
	{
		this.Nom_Batiment=Nom_Batiment;
		this.nbrMax=nbrMax;
		try
		{
		NomSalle = Salle.getNextSalle(Nom_Batiment);
		}
		catch(NbrMaxException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public String getNom_Batiment() {
		return Nom_Batiment;
	}
	public void setNom_Batiment(String nom_Batiment) {
		Nom_Batiment = nom_Batiment;
	}
	public int getNbrMax() {
		return nbrMax;
	}
	public void setNbrMax(int nbrMax) {
		this.nbrMax = nbrMax;
	}
	
	public String getNomSalle() {
		return NomSalle;
	}

	public void setNomSalle(String nomSalle) {
		NomSalle = nomSalle;
	}
}
