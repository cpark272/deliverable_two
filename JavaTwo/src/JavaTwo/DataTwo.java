package JavaTwo;
import java.util.Scanner;

public class DataTwo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//List of variables
		String string1 = null;
		String string2 = null;
		int unicode = 0;
		int total1 = 0;
		int total2 = 0;
		
		//Input string 1 and 2
		System.out.println("Please enter the first string:");
		string1 = scan.next();
		
		System.out.println("Please enter the second string:");
		string2 = scan.next();

		//Loop for string1
		int counterOne = 0;
		for (int i = 0; i < string1.length(); i++) {
			 if (Character.isLetter(string1.charAt(i)))
				 counterOne++;
			 System.out.print(string1.charAt(i) + ": ");
			 unicode = (int)(string1.charAt(i));
			 System.out.println(unicode);
			 total1 = unicode + total1;
		}

		//Total for string1
		//System.out.println(total1);

		//Loop for string2
		int counterTwo = 0;
		for (int i = 0; i < string2.length(); i++) {
			 if (Character.isLetter(string2.charAt(i)))
				 counterTwo++;
			 System.out.print(string2.charAt(i) + ": ");
			 unicode = (int)(string2.charAt(i));
			 System.out.println(unicode);
			 total2 = unicode + total2;
		}

		//Total for string2
		//System.out.println(total2);

		//Sum of absolute value between the two strings
		System.out.println(Math.abs(total1 - total2));
		
		
	}

}


//System.out.println(counter + " letters.");
