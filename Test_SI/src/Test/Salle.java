package Test;

public class Salle {

	
	private static  int i = 0;
	public static String getNextSalle(Batiment batiment) throws NbrMaxException {
        if(batiment.getNbrMax() <i)
        {
        	i = 0 ;
        	throw new NbrMaxException("Le nombre de salle est limité!!");
        }
		i++;
        return String.format("Salle %02d", i);
    }
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		Salle.i = i;
	}
	
}
