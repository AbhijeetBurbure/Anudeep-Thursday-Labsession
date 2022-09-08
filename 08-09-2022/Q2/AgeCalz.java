import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;  
public class AgeCalz 
{  
	public static void main(String args[])   
	{  
		System.out.println("-------************Age Calculator ************--------");  
		
		System.out.println("Enter date of birth in YYYY-MM-DD format: ");  
		Scanner scanner = new Scanner(System.in);  
		String Sc = scanner.nextLine();  
		scanner.close();  
		LocalDate todays = LocalDate.now();
		LocalDate dob = LocalDate.parse(Sc);
		
		Period a = Period.between(dob, todays);
		
		Period.between(dob, todays).getYears();
		Period.between(dob, todays).getMonths();
		Period.between(dob, todays).getDays();
		
 
		System.out.println("You are " + a.getYears()+" years "+a.getMonths()+" Months and "+a.getDays()+" Days old.");  
	}  
}
	