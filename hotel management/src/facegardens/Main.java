package facegardens;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int room=0;
   
    
	//static int booked[25]= {0};
	public static void main(String[] args) throws IOException {
		 int flag = 0;
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		String j;
		do {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter your Name");
		   name = br.readLine();
		   System.out.println("Enter your Address");
		   address = br.readLine();
		   System.out.println("Enter your Contact Number");
		   contactNumber = br.readLine();
		   System.out.println("Enter your Email");
		   email = br.readLine();
		   System.out.println("Enter your Proof Type");
		   proofType = br.readLine();
		   System.out.println("Enter your Proof Id ");
		   proofId = br.readLine();
		   Customer cust = new Customer(name,address,contactNumber,email,proofType,proofId);
		  
		   cust.register(name,address,contactNumber,email,proofType,proofId);
		   System.out.println("Do you want to continue(Y/N)");
		   j = br.readLine();
		}
		while(j.equalsIgnoreCase("Y"));
		if(j.equalsIgnoreCase("N"))
		{
		System.out.println("Thanks");
		}
		
		
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	String i;
	String b;
	int r=0;
	int booked[] = new int[25];
	Guest gus = new Guest();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do {
	   System.out.println("Menu");
	   System.out.println("1. Book \n2. Check Status \n3. Exit");
	   System.out.println("Enter your choice");
	   int m;
	   m =Integer.parseInt(br.readLine());
	   switch(m)
	   {
	   case 1:
		   do {
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Booking");
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
    //Guest gu = new Guest(ac,cot,cable,wifi,laundry); 
    System.out.println("Do you want to Proceed(Yes/No)");
    i = br.readLine();
	}while(i.equalsIgnoreCase("No"));
    if(i.equalsIgnoreCase("Yes")) {
  	System.out.println("Thank you for booking. Your room number is "+ ++room);
    
  	booked[room]=1;
  	
	   break;
    }
	   
	   case 2:
	   {
		    System.out.println("Enter room number");
		    int v;
		    v =Integer.parseInt(br.readLine());
		    for(int d=0;d<25;d++)
		    {
		    	if(booked[v]==1)
		    	{
		    		flag=1;
		    		System.out.println("The room is booked");
		    		break;
		    	}
		    	else
		    	{
		    		System.out.println("The room is available");
		    		break;
		    	}
		    	
		    }
		    break;
	   }
	   
 case 3:
	   {
		   System.exit(0);
	   }
	   break;
	   }
	System.out.println("Do you want to continue(Yes/No)");
	b = br.readLine();
	}while(b.equalsIgnoreCase("Yes"));
    if(b.equalsIgnoreCase("No")) {
  	//System.out.println("Thank you for booking. Your room number is "+ ++room);
	}
	}	
	}
	


	
	

