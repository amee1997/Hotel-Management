package facegardens;
public class Customer {
	       private String name;
		   private String address;
		   private String contactNumber;
		   private String email;
		   private String proofType;
		   private String proofId;
		   static int registerId = 0;
	       public Customer(String name, String address, String contactNumber, String email, String proofType,
				String proofId) {
			// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAddress(address);
		this.setContactNumber(contactNumber);
		this.setEmail(email);
	    this.setProofType(proofType);
	    this.setProofId(proofId);
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getProofType() {
			return proofType;
		}
		public void setProofType(String proofType) {
			this.proofType = proofType;
		}
		public String getProofId() {
			return proofId;
		}
		public void setProofId(String proofId) {
			this.proofId = proofId;
		}
		void register(String name,String address,String contactNumber,String email,String proofType,String proofId)
		{
			System.out.println("Your details are:");
			System.out.println(getName());
			System.out.println(getAddress());
			System.out.println(getContactNumber());
			System.out.println(getEmail());
			System.out.println(getProofType());
			System.out.println(getProofId());
			System.out.println("Thanks for registering your resgister id is "+  ++registerId);
		}
		

	}



