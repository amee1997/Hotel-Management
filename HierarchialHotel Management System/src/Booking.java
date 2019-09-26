

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	 
	   public int persons;
	   public int total_Days;
	   public double tariff;
	   public String room_Type;
	   public int month;
	   public int charge;
	   public int discount;
	   public double total_Tariff;
	   public int roomBooking;

	public double roomBooking(int persons,int total_Days ,double tariff ,String room_Type)
		{ 
           double total_Tariff = tariff* total_Days*persons;
               
		      return total_Tariff;
		}
	   
	public int getMonth() {
		return month;
	}

    public void setMonth(int month) {
		this.month = month;
	}

    public int getCharge() {
		return charge;
	}

    public void setCharge(int charge) {
		this.charge = charge;
	}

    public int getDiscount() {
		return discount;
	}
    
    public void setDiscount(int discount) {
		this.discount = discount;
	}

    public int getPersons() {
		return persons;
	}

    public void setPersons(int persons) {
		this.persons = persons;
	}

    public int getTotal_Days() {
		return total_Days;
	}

    public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}

    public double getTariff() {
		return tariff;
	}

    public void setTariff(double tariff) {
		this.tariff = tariff;
	}

    public String getRoom_Type() {
		return room_Type;
	}

    public void setRoom_Type(String room_Type) {
		this.room_Type = room_Type;
	}

}


