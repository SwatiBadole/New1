package lambdaexpression;

import java.util.regex.*;
import java.util.Scanner;

@FunctionalInterface
 interface validate {
	public boolean compute(String value);
 }


public class UserRegistration {



		  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
		  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
		  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,3}[,]?[.]?[a-z]?$";
		  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
		  private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}";
		 
		  validate Fname =(fname)  ->{
		          
	                  Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
	                  boolean result = pattern.matcher(fname).matches();
	                   return result ;

		         };
	  
	          
	    
		         validate Lname = (lname)-> {
	    
	              Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
	              boolean result = pattern.matcher(lname).matches();
	               return result ;
	         };
	      
	      validate EmailId = (emailid)->{
	        
	               Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
	               boolean result = pattern.matcher(emailid).matches();
	                   return result ;
	        };
	    
	      validate PhoneNumber = (pnumber)->{
	          
	                Pattern pattern = Pattern.compile(PHONE_NUMBER);
	                boolean result = pattern.matcher(pnumber).matches();
	                    return result ;
	        };
	    
	     validate password = (String password) ->{
	        
	             Pattern pattern = Pattern.compile(PASSWORD);
	             boolean result = pattern.matcher(password).matches();
	                 return result ;
	            };
	      
	    	  Scanner in = new Scanner(System.in);
	  
	  		public String getfirstname() {
	  		System.out.println("ENTER FIRST NAME : ");
			String fname = in.next();
			return fname ;
	  		}
			
	  		public String getlastname() {
			System.out.println("ENTER LAST NAME : ");
			String lname = in.next();
			return lname ;
	  		}
			
			public String getEmailid() {
			System.out.println("ENTER EMAILID : ");
			String emailid = in.next();		
			return emailid ;
			}
			
			public String getPhonenumber() {
			System.out.println("ENTER MOBILE NUMBER : ");
			String pnumber = in.next();
			return pnumber ;
			}
			
			public String getPassword() {
			System.out.println("ENTER PASSWORD  : ");
			String password = in.next();
			return password ;
			}
			
	
	}


