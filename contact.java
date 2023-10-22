package contactService;

public class contact {
	
	private String contactID; //length must be <= 10
	private String firstName; //length must be <= 10
	private String lastName; //length must be <= 10
	private String phoneNumber; //length must be = 10
	private String address; //length must be <= 30
	
	public contact(String cid, String first, String last, String phone, String addr) {
		//Set the length and null requirements for variables
		if(cid == null || cid.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID - Cannot be null or over 10 character spaces.");
		}
		if(first == null || first.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name - Cannot be null or over 10 character spaces.");
		}
		if(last == null || last.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name - Cannot be null or over 10 character spaces.");
		}
		if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
		    throw new IllegalArgumentException("Invalid Phone Number - Must be 10 digits.");
		}
		if(addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Invalid Address - Cannot be null or over 30 character spaces");
		}
		
		this.contactID = cid;
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = phone;
		this.address = addr;
	}
	//Start getters for variables
	public String getContactID() {
		return this.contactID;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}
	//Start setters for variables
	
	public void setFirstName(String first) {
		if(first == null || first.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name - Cannot be null or over 10 character spaces.");
		}
		this.firstName = first;
	}
	public void setLastName(String last) {
		if(last == null || last.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name - Cannot be null or over 10 character spaces.");
		}
		this.lastName = last;
	}
	public void setPhoneNumber(String phone) {
		if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
		    throw new IllegalArgumentException("Invalid Phone Number - Must be 10 digits.");
		}
		this.phoneNumber = phone;
	}
	public void setAddress(String addr) {
		if(addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Invalid Address - Cannot be null or over 30 character spaces");
		}
		
		this.address = addr;
	}
	// Update first name based on contact ID
    
}
	

