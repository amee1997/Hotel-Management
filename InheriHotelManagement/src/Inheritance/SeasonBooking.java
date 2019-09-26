package Inheritance;

public class SeasonBooking extends Booking {
  //SeasonBooking sb = new SeasonBooking();
  
 double tariff(int persons,int total_Days ,double tariff ,String room_Type)
 {
 return super.roomBooking(super.persons,super.total_Days,super.tariff,super.room_Type);
 
   // System.out.println("Total Tariff is:"  +total_Tariff);
 }  
    
}
