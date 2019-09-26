package Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		    int persons;
		    int total_Days;
		    double tariff;
		    String room_Type;
		    //double total_Tariff ;
		    Guest gu = new Guest();
		    Booking bo = new Booking();
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Number of persons");
			persons =Integer.parseInt(br.readLine());
			gu.setPersons(persons);
			System.out.println("Total number of days");
			total_Days =Integer.parseInt(br.readLine());
			gu.setTotal_Days(total_Days);
			System.out.println("Tariff per day");
			tariff =Integer.parseInt(br.readLine());
			gu.setTariff(tariff);
			System.out.println("Enter the room type");
			room_Type = br.readLine();
			gu.setRoomType(room_Type);
			double total_Tariff1 = bo.roomBooking(persons,total_Days,tariff,room_Type);
			System.out.println("Total Tariff is:"  +total_Tariff1);

	}

}
