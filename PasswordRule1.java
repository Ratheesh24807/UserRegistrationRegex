package userRegistration;

import java.util.regex.Pattern;

public class PasswordRule1 {

	public static void main(String[] args) {

		String PasswordRegex = "^[0-9]{8,}$";
		String Password = "12345678";
		boolean result = Pattern.matches(PasswordRegex, Password);
		System.out.println(result);
		
	}

}
