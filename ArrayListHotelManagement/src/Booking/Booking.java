package Booking;

//import MainPackage.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Booking {
	
	
	int c= 0;
	int d = 0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void booking(String ac,String cot,String cable,String wifi,String laundry) throws IOException
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
  }