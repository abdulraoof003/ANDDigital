package telecoms;

public class RunnerClass {

	public static void main(String[] args) {
		// Runs all the methods

		// creates an object called tel
		Telecoms tel = new Telecoms();

		// Setting values for the instance of the phone item

		Phonenum phone1 = new Phonenum(1, "01442357564", false);
		Phonenum phone2 = new Phonenum(1, "01535357564", true);
		Phonenum phone3 = new Phonenum(2, "01134357564", false);

		// Add items into array phoneNumList array
		tel.addPhoneNum(phone1);
		tel.addPhoneNum(phone2);
		tel.addPhoneNum(phone3);
	
		// Output all items in the library
		System.out.println("After all items are added ");
		tel.outputPhoneNums();

		Integer customerId;
		
		// list phone numbers belonging to a customer by matching on customer id
		customerId = 1;
		tel.customerPhoneNums(customerId);
		customerId = 4;
		tel.customerPhoneNums(customerId);

		String phoneNumber;
		
		phoneNumber = "01134357564";
		// Activate the phone number 01134357564
		tel.activatePhoneNum(phoneNumber);
		
		phoneNumber = "0113777777";
		// Activate the phone number 0113777777
		tel.activatePhoneNum(phoneNumber);
				
		phoneNumber = "01134357564";
		// Activate the phone number 01134357564
		tel.activatePhoneNum(phoneNumber);
		
	}
}