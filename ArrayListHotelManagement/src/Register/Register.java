package Register;

import Customer.Customer;

public class Register {
    static Customer cust  = new Customer();

	public void register(String name,String address, String contactNumber, String email, String proofType,
			String proofId) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Thanks for registration");
		System.out.println("Your details are: ");
		this.display();
	}
	public void display()
	{
		System.out.println("First Name :" +cust.getName());
		System.out.println("Address :" +cust.getAddress());
		System.out.println("Contact Number :" +cust.getContactNumber());
		System.out.println("Email :" +cust.getEmail());
		System.out.println("Proof Type :" +cust.getProofType());
		System.out.println("Proof Id :" +cust.getProofId());
		
	}
	
}
