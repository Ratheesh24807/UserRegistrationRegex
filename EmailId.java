package userRegistration;

import java.util.regex.Pattern;

public class EmailId {

	public static void main(String[] args) {
      String EmailRegex = "^[abc]{3}[.xyz]*@[bl]{2}.[co]{2}[.in]*$";
      String Email = "abc.xyz@bl.co.in";
      boolean result = Pattern.matches(EmailRegex, Email);
      System.out.println(result);
	}

}
