/****************************************************************
 * Program Assignment #1 (CIS 560, Fall 2015)                   *

	===============
	CIS 560 Group 3
	===============
	Name: Low, Chien Sien (L)
	Email Address: clow1@umassd.edu
	
	Name: Vijayaraghavalu, Jayeshkumar
	Email Address: jvijayaraghavalu@umassd.edu
	
	Name: Cherukuru Diwakar Naidu, Tarun
	Email Address: Tcherukurudiwakarnai@umassd.edu
	
	Submitted date: 9/23/2015

 ****************************************************************/
package email_chk;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class my_main {
	//metacharacters for [a-zA-Z]{1} represents the first characters only can be either word character on lower case or upper case
	//metacharacters for [A-Za-z_0-9]{4,9} represents the characters can be words, digits, and "_" and contains within 4-9 letters
	//metacharacters for @(umassd.edu|gmail.com) represents it matches @umassd.edu or @gmail.com
	public static boolean validateEmailAddress(String emailAddress){
		final String emailPattern = "[a-zA-Z]{1}+[A-Za-z_0-9]{4,9}+@(umassd.edu|gmail.com)";
		Pattern pattern = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(emailAddress); 
		return matcher.matches();
	}
	//words[] got split into the two parts the one before @ and the one after @
	//words[0] is local part
	//words[1] is domain part
	public static String getLocalPart(String emailAddress){
		Pattern pattern = Pattern.compile("@");  
	    String[] words = pattern.split(emailAddress);  
		return words[0];
	}
	public static boolean isUmassdAccount(String emailAddress){
		String string1="umassd.edu";
		Pattern pattern = Pattern.compile("@");  
	    String[] words = pattern.split(emailAddress);
	    Pattern pattern2 = Pattern.compile(words[1],Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern2.matcher(string1);
	    return matcher.matches();
	}
	public static boolean isGmailAccount(String emailAddress){
		String string1="gmail.com";
		Pattern pattern = Pattern.compile("@");  
	    String[] words = pattern.split(emailAddress);
	    Pattern pattern2 = Pattern.compile(words[1],Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern2.matcher(string1);
	    return matcher.matches();
	}
    public static void main(String[] args) {  

    	System.out.println(validateEmailAddress("clow1@umassd.edu"));
    	System.out.println(getLocalPart("clow1@umassd.edu"));
    	System.out.println(isUmassdAccount("clow1@umassd.edu"));
    	System.out.println(isGmailAccount("clow1@gmail.com"));
    	
    }  

}
