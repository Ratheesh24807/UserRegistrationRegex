package userRegistration;

import java.util.regex.Pattern;

public class LastName {

	public static void main(String[] args) {
     String FirstnameRegex = "^[A-Z]{1}[A-Za-z]{3,}$";
     String Firstname = "Vishwesh";
     String LastnameRegex = "^[A-Z]{1}[A-Za-z]{3,}$";
     String Lastname = "Manjunath";
     boolean result = Pattern.matches(FirstnameRegex, Firstname);
     boolean result1 = Pattern.matches(LastnameRegex, Lastname);
     System.out.println(result);
     System.out.println(result1);
  
     
	}

}
