interface iContactDetails{
	public void details(String firstName, String LastName, String area, String city, String state, int pincode, int phoneNumber, String email);
}

class ContactDetails{

	public final String firstName;
	public final String lastName;
	public final String area;
	public final String city;
	public final String state;
	public final int pincode;
	public final int phoneNumber;
	public final String email;

	public ContactDetails(String firstName, String lastName, String area, String city , String state, int pincode, int phoneNumber, String email){

		this.firstName = firstName;
		this.lastName = lastName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String toString(){

		return "Details of: "+ firstName+ " "+lastName+"\n"
						    +"Area: "+area+"\n"
						    +"City: "+city+"\n"
						    +"State: "+state+"\n"
						    +"pincode: "+pincode+"\n"
						    +"Phone Number: "+phoneNumber+"\n"
						    +"Email: "+email;
	}
}

public class Addressbook implements iContactDetails {

	private int numOfPerson = 0;
	private ContactDetails[] contactDetails;

	public Addressbook(){
		contactDetails = new ContactDetails[3];
	}

	public void details(String firstName, String lastName, String area, String city , String state, int pincode, int phoneNumber1, String email){
		contactDetails [ numOfPerson ] = new ContactDetails(firstName, lastName, area, city, state, pincode, phoneNumber1, email);
		numOfPerson++;
	}

	private void computeDetails(){
		for (int i=0; i<numOfPerson; i++){
			System.out.println(contactDetails[i]);
		}
	}


		public static void main(String[] args){
		System.out.println("Welcome To Address Book Problem");

		Addressbook address = new Addressbook();
		address.details("Deep", "Saha", "Ejipura", "Bangalore", "Karnataka", 560047, 9916522077, "deepsaha9@gmail.com");
		address.computeDetails();
	}		
}	
