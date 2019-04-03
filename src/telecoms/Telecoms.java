package telecoms;

import java.util.ArrayList;

public class Telecoms {

	// setting up an array to store phone numbers
	public ArrayList<Phonenum> phoneNumList = new ArrayList<Phonenum>();

	// add phone numbers into the array
	public void addPhoneNum(Phonenum I) {
		phoneNumList.add(I);
	}

	// outputting all items in the library
	public void outputPhoneNums() {
		for (Phonenum I : phoneNumList) {
			System.out.println("Customer id " + I.custId + " Phone number "
					+ I.phoneNum + " Active: " + I.active);

		}
	}	
	
	// Display all phone numbers for the customer id which has been input
	public void customerPhoneNums(Integer customerId) {

		boolean foundCustomer = false;
		
		System.out.println("Phone numbers for Customer Id: " + customerId);
		
		for (int i = 0; i < phoneNumList.size(); i++) {
			if (phoneNumList.get(i).custId == customerId)  {
				foundCustomer = true;
				System.out.println("Phone number " + phoneNumList.get(i).phoneNum);
				}}
		if (foundCustomer == false) {
			System.out.println("No Phone numbers found for Customer Id: " + customerId);
		}
	}
	
	// Activate a phone number
	public void activatePhoneNum(String phoneNumber) {
		boolean matchFound = false;
		
		for (int i = 0; i < phoneNumList.size(); i++) {
			if (phoneNumList.get(i).phoneNum == phoneNumber) {
				matchFound = true;
				if (phoneNumList.get(i).active) {
					System.out.println("Phone number " + phoneNumber + " Already active");
					break;
				} else {
					phoneNumList.get(i).active = true;
					System.out.println("Phone number " + phoneNumber + " Activated");
				}
			}
		}
		if (!matchFound) {
			System.out.println("Phone number " + phoneNumber + " Not found in system");
		}
	}
	
}
