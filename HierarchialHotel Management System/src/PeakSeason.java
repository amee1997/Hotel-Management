
public class PeakSeason extends Booking {
	

	public double roomBooking(int persons,int total_Days ,double tariff ,String room_Type,int month,int charge)
	{ 
        double total = (super.roomBooking(persons,total_Days,tariff,room_Type)*charge);
            
	      return total;
	}
}
