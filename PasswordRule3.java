package userRegistration;

import java.util.regex.Pattern;

public class PasswordRule3 {

	public static void main(String[] args) {

		String PasswordRegex = "[0-9]{1,}[A-Z]{7,}";
		String Password = "1WHTYASHJL";
		boolean result = Pattern.matches(PasswordRegex, Password);
		System.out.println(result);
	}

}
