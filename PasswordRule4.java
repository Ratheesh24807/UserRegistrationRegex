package userRegistration;

import java.util.regex.Pattern;

public class PasswordRule4 {

	public static void main(String[] args) {

		String PasswordRegex = "([0-9]{1,}@[A-Z]{1,})";
		String Password = "12345676@A";
		boolean result = Pattern.matches(PasswordRegex, Password);
		System.out.println(result);
		
	}

}
