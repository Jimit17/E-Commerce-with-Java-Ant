/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;
import java.util.regex.*;
/**
 *
 * @author Jimit Shukla
 */
public class Mail_Chck {
    public static boolean
	isValidEmail(String email)
	{
            // Regex to check valid email
		String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
                                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the email is empty return false
		if (email == null) {
			return false;
		}

		// Pattern class contains matcher() method to find matching between given password and regular expression.
		Matcher m = p.matcher(email);

		// Return if the emmail matched the ReGex
		return m.matches();
        }
}
