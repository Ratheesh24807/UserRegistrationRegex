package userRegistration;

import java.util.regex.Pattern;

public class PasswordRule2 {

	public static void main(String[] args) {

		String PasswordRegex = "[0-9]{7,}[A-Z]{1,}$";
		String Password = "12334567889W";
		boolean result = Pattern.matches(PasswordRegex, Password);
		System.out.println(result);
		
	}

}
