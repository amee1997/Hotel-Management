package facegardens;

public class Guest {
	

	private String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	int c= 0;
	int d = 0;
	
/*	int CheckStatus(int v,int room,int flag)
	{
		//System.out.println(v+" "+room);
		if((v==room) && (room<=25))
		{
			
			System.out.println("Room number"+" "+v+" "+"is booked");
			flag=1;
		}
		else if(v>25)
		{
			System.out.println("Room not exist");
		}
		else if(room!=v && v>25)
		{
			System.out.println("The room number"+" "+v+" "+"is available");
		}
		//flag=1;
		return flag;
	
		
	}
	*/
	public Guest(String ac,String cot,String cable,String wifi,String laundry)
	{
		if(ac.equalsIgnoreCase("AC"))
		{
	       c = c + 1000;
		}
		if(ac.equalsIgnoreCase("nAC"))
		{
		   c = c +750;
		    }
		if(cot.equalsIgnoreCase("Single")){
			c = c + 0;
		                      }
		if(cot.equalsIgnoreCase("Double")) {
			c = c + 350;
		}
		if(cable.equalsIgnoreCase("C"))
		{
			c = c + 50;
		}
		if(cable.equalsIgnoreCase("nC")) {
			c = c + 0;
		}
		if(wifi.equalsIgnoreCase("W"))
		{
			c = c + 200;
		}
		if(wifi.equalsIgnoreCase("nW")) {
			c = c + 0;
		}
		if(laundry.equalsIgnoreCase("L"))
		{
			c = c + 100;
		}
		if(laundry.equalsIgnoreCase("nL")) {
			c = c + 0;
		}
		System.out.println("The total charge is " + c);
		System.out.println("The service choosen are:");
		System.out.println(cot+" " +"cot"+" " +ac+" "+"room");
		
		if(cable.equalsIgnoreCase("C"))
		{
			System.out.println("Cable connection enabled");
		}
		else
		{
			System.out.println("No Cable");
		}
		if(wifi.equalsIgnoreCase("W"))
		{
			System.out.println("Wi-Fi enabled");
		}
		else
		{
			System.out.println("No Wi-Fi");
		}
		if(laundry.equalsIgnoreCase("L"))
		{
			System.out.println("With laundry Service");
		}
		else
		{
			System.out.println("No loundry Service");
		}
	}
	public Guest() {
		// TODO Auto-generated constructor stub
	}
	

}

