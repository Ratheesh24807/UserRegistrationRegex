package userRegistration;

import java.util.regex.Pattern;

public class UserFirstName {

	public static void main(String[] args) {

		String Firstnameregex = "^[A-Z]{1}[a-zA-Z]{3,}$";
		String Firstname = "Vishwesh";
		boolean result = Pattern.matches(Firstnameregex, Firstname);
		System.out.println(result);
		
	}

}
