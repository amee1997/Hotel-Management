package Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	 
	   public int persons;
	   public int total_Days;
	   public double tariff;
	   public String room_Type;
	   public double total_Tariff ;
	    Guest gu = new Guest();
	   // Booking bo = new Booking();
	   
	
	 public double roomBooking(int persons,int total_Days ,double tariff ,String room_Type)
		{ 
            double total_Tariff1 = tariff* total_Days*persons;
                
		      return total_Tariff1;
		}
            


}


