package Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FonctionnalitesReservation {

	private List<Reservation> reservations ;
	
	public FonctionnalitesReservation()
	{
		reservations = new ArrayList<>();
		
	}
	public void AddReservation(Reservation reservation , String id) throws DejaReservéeException
	{
		
		
		if(reservations.contains(reservation.getSalle()))
		{
			throw new DejaReservéeException("Salle  deja Reservée");
		}
		else
		{
		reservations.add(reservation);
		}
	}
		public void ModifierReservation(String IdResrvation,
		 String Nom_Employe,
		 LocalDateTime Date,
		 double Durée,
		 Salle salle)throws ReservationNonTrouvéeException
		{
			for(Reservation reservation : reservations)
			{
				if(reservation.getIdResrvation().equals(IdResrvation))
				{
					reservation.setIdResrvation(IdResrvation);
					reservation.setNom_Employe(Nom_Employe);
					reservation.setDate(Date);
					reservation.setDurée(Durée);
					reservation.setSalle(salle);
					return;
				}
			}
			throw new ReservationNonTrouvéeException("Reservation non-trouvée");
			
		}
	
		public void removeReservation(Reservation reservation , String id) throws ReservationNonTrouvéeException
		{
			if(id.equals(reservation.getIdResrvation()))
			{
				reservations.remove(reservation);
			}
			else
			{
				throw new ReservationNonTrouvéeException("Reservation non-trouvée");
			}
		}
	
}
