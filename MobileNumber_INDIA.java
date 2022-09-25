package userRegistration;

import java.util.regex.Pattern;

public class MobileNumber_INDIA {

	public static void main(String[] args) {

		String MobileNumberRegex = "^[91]{2}[0-9]{10}";
		String MobileNumber = "911234567889";
		boolean result = Pattern.matches(MobileNumberRegex, MobileNumber);
		System.out.println(result);
	}

}
