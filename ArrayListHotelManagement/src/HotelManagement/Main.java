package HotelManagement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

import Booking.Booking;
import Customer.Customer;
import Register.Register;


public class Main {
	static int room=0;
	static int custId=0;
	static int regId=0;
   
	
	public static ArrayList<String> namearray = new ArrayList<String>();
	public static ArrayList<String> emailarray = new ArrayList<String>();
	public static ArrayList<Integer> bookedarray = new ArrayList<Integer>();
	public static ArrayList<Integer> datearray = new ArrayList<Integer>();
	public static ArrayList<Integer> customerId = new ArrayList<Integer>();
	
	static Customer cust = new Customer();
	static Register reg = new Register();
	static Booking book = new Booking();
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String name;
	    String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String p;
		String a = null;
		String t;
		String j;
		int flag = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		while(true) {
		   
		    
		   System.out.println("*************MENU*************");
		   System.out.println("\t1.REGISTER \n\t2.BOOKING \n\t3.CHECK STATUS \n\t4.EMAIL \n\t5.ALL BOOKINGS\n\t6.ALL CUSTOMERS\n\t7.EXIT");
		   System.out.println("Enter your choice");
		   int m;
		   m =Integer.parseInt(br.readLine());
		   switch(m)
		   {
		   case 1:
		   {   
			       System.out.println("********Registration*********");
				   System.out.println("Enter your Name");
				   name = br.readLine();
				   namearray.add(name);
				   cust.setName(name);
				   System.out.println("Enter your Address");
				   address = br.readLine();
				   cust.setAddress(address);
				   System.out.println("Enter your Contact Number");
				   contactNumber = br.readLine();
				   cust.setContactNumber(contactNumber);
				   System.out.println("Enter your Email");
				   email = br.readLine();
				   emailarray.add(email);
				   cust.setEmail(email);
				   System.out.println("Enter your Proof Type");
				   proofType = br.readLine();
				   cust.setProofType(proofType);
				   System.out.println("Enter your Proof Id ");
				   proofId = br.readLine();
				   cust.setProofId(proofId);
				   reg.register(name,address,contactNumber,email,proofType,proofId);
				 
                   
				   
			  System.out.println("Thank you for registering. Your Customer id is :"+ ++custId);
			  customerId.add(custId);
			  System.out.println("Do you want to continue(Yes/No)");
			  j =br.readLine();
			  if(j.equalsIgnoreCase("NO"))
			  {
				  System.out.println("Thanks Have a Nice Day!--");
				  System.exit(0);
				  break;
			  }
			  if(j.equalsIgnoreCase("yes"))
			  
			  break;
			     
		   }
		   case 2:
		   {       
			 	
			System.out.println("************Booking************");
			System.out.println("Please choose the service required");
			System.out.println("AC/nAC");
			ac = br.readLine();
			System.out.println("Cot(Single/Double)");
			cot = br.readLine();
			System.out.println("With cable connection/Without cable connection(C/nC)");
		    cable = br.readLine();
		    System.out.println("wifi needed or not(W/nW)");
		    wifi = br.readLine();
		    System.out.println("Loundry needed or not(L/nL)");
		    laundry = br.readLine();
		    System.out.println("Enter the date of booking");
		    int date = Integer.parseInt(br.readLine());
		    datearray.add(date);
		    System.out.println("Do you want to Proceed(Yes/No)");
		    p = br.readLine();
			}while(p.equalsIgnoreCase("No"));
		    if(p.equalsIgnoreCase("Yes")) {
		  	System.out.println("Thank you for booking. Your room number is "+ ++room);
		  	book.booking(ac,cot,cable,wifi,laundry);
		    bookedarray.add(room);
		    System.out.println("Do you want to continue(Yes/No)");
			j =br.readLine();
			if(j.equalsIgnoreCase("yes"))
			  {
				  continue;
			  }
			else
			{
				 System.exit(0);
			}
			break;
	        }

		   case 3:
		   {
			    System.out.println("Enter the room number");
			    int v;
			    v =Integer.parseInt(br.readLine());
			    for(int d=0;d<custId;d++)
			    {
			    	if(bookedarray.get(d)==v)
			    	{
			    		flag = 1;
			    		System.out.println("The room is booked No."+bookedarray.get(d));
			    		
			    		break;
			    	}
			    	else
			    	{
			    		flag=0;
			    		
			    	}
			    	
			    }
			    if(flag==0) {
		    		System.out.println("The room is free to book");
		    		
		    	            }
			    break;
		   }
		   
		   case 4:
		   { 
		   
			  System.out.println("Enter the current Id");
			  int enterid = Integer.parseInt(br.readLine());
			  int z=--enterid;
		      System.out.println(emailarray.get(z));
			  System.out.println("Enter the new Email Id");
			  String email1 = br.readLine();
			  emailarray.set(z,email1);
			  System.out.println(namearray.get(z)+" "+"'s"+" "+ "new email id is"+" "+emailarray.get(z));
			  break;
		   }
		   
		  
		   case 5:
		   {
			   System.out.println("Enter the Start date");
			   int start = Integer.parseInt(br.readLine());
			   System.out.println("Enter the End date ");
			   int end = Integer.parseInt(br.readLine());
			   for(int y=0;y<custId;y++)
			   {
				   if((datearray.get(y)>=start) && (datearray.get(y)<=end))
				   {
					   System.out.println(customerId.get(y) +"    "+namearray.get(y));
				   }
				   else
				   {
					   System.out.println("Invalid date!----Please check your date");
				   }
			   }
			   break;
		   }
		   case 6:
		   {
			    System.out.println("Customers List");
				System.out.println("The registered customers are:");
				for(int s=0;s<custId;s++)
				{  
					System.out.println("Customer id"+"   "+"Name");
					System.out.println(customerId.get(s)+"               "+namearray.get(s));              
					
				}
				break;
		   }
		   case 7:
		   {
			   System.out.println("Bye");
			   System.exit(0);
		   }
		
		}
	  }
   }	
}

		
		
