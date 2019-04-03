package telecomstest;

import static org.junit.Assert.*;

import org.junit.*;

import telecoms.*;

public class testtelecoms {

	@Test
	public void test_1() {

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
		
		assertFalse(tel.phoneNumList.get(0).active);
		assertTrue(tel.phoneNumList.get(1).active);

	}

}

