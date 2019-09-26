package Inheritance;

public class Guest {
	private int persons;
	private int total_Days;
	private double tariff;
	private String room_Type;
	double total_Tariff;

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
	public void setRoomType(String room_Type) {
		this.room_Type = room_Type;
	}
	
}

