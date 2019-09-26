
public class LeanSeason extends Booking{

	public double roomBooking(int persons,int total_Days ,double tariff ,String room_Type,int month,int discount)
	{ 
        double total = super.roomBooking(persons,total_Days,tariff,room_Type)*discount/100;
          double value = super.roomBooking(persons,total_Days,tariff,room_Type) - total;
	      return value;
	}
}

