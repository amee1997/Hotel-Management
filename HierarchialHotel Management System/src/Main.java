

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		    int persons;
		    int total_Days;
		    double tariff;
		    String room_Type;
		    int month;
		   
		    PeakSeason ps = new PeakSeason();
		    LeanSeason lb = new LeanSeason();
		    Booking bo = new Booking();
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Number of persons");
			persons =Integer.parseInt(br.readLine());
			bo.setPersons(persons);
			System.out.println("Total number of days");
			total_Days =Integer.parseInt(br.readLine());
			bo.setTotal_Days(total_Days);
			System.out.println("Tariff for a single person");
			tariff =Integer.parseInt(br.readLine());
			bo.setTariff(tariff);
			System.out.println("Enter the room type");
			room_Type = br.readLine();
			bo.setTariff(tariff);
            System.out.println("Enter the month");
            month =Integer.parseInt(br.readLine());
            bo.setMonth(month);
            {
            	if(month==4 || month==5 || month==6 || month==9 || month==11 || month==12)
            	{
            		System.out.println("Enter the peakCharge");
            		int charge =Integer.parseInt(br.readLine());
            		bo.setCharge(charge);
            		
            		double v = ps.roomBooking(persons,total_Days,tariff,room_Type,month,charge);
            		System.out.println("Total Tariff:" +v);
            	}
            	if(month==1 || month==2 || month==3 || month==7 || month==8 || month==10)
            	{
            		System.out.println("Enter the discount");
            		int discount =Integer.parseInt(br.readLine());
            		bo.setDiscount(discount);
            		
            		double y = lb.roomBooking(persons,total_Days,tariff,room_Type,month,discount);
            	    System.out.println("Total Tariff:" +y);
            	}
            		
            		
            }
            
	}

}
