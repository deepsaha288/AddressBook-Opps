import java.util.Scanner;

interface iContactDetails{
	public void Adddetails(String firstName, String LastName, String area, String city, String state, int pincode, int phoneNumber, String email);
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

	private static int numOfPerson;
	private ContactDetails[] contactDetails;

	public Addressbook(){
		contactDetails = new ContactDetails[5];
	}

	public void Adddetails(String firstName, String lastName, String area, String city , String state, int pincode, int phoneNumber, String email){
		contactDetails [ numOfPerson ] = new ContactDetails(firstName, lastName, area, city, state, pincode, phoneNumber, email);
		numOfPerson++;
	}

	private void computeDetails(){
		for (int i=0; i<numOfPerson; i++){
			System.out.println(contactDetails[i]);
		}
	}


		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Number Of Details to Add");
		int numOfPerson=sc.nextInt();
		String name=sc.nextLine();
		Addressbook address = new Addressbook();


		for (int i = 1; i <= numOfPerson; i++) {

			System.out.println("Enter no. of details of: "+i);

			System.out.println("Enter FirstName");
			String firstName=sc.next();
			System.out.println("Enter LastName");
			String lastName=sc.next();
			System.out.println("Enter Area");
			String area=sc.next();
			System.out.println("Enter CityName");
			String city=sc.next();
			System.out.println("Enter StateName");
			String state=sc.next();
			System.out.println("Enter pinCode");
			int pincode=sc.nextInt();
			System.out.println("Enter PhoneNumber");
			int phoneNumber=sc.nextInt();
			System.out.println("Enter Email");
			String email=sc.next();

			address.Adddetails(firstName, lastName, area, city, state, pincode, phoneNumber, email);
			address.computeDetails();
		}
	}		
}	
