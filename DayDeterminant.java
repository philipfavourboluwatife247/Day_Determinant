import java.util.Scanner;
public class DayDeterminant{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		/* #This code will print out the day of the week based on user input on the date  

#FORMULA                                    #y = y - (14 - m) / 12;
#x = y + (y / 4) - (y / 100) + (y / 400);
#m = m + 12 * ((14 - m) / 12) - 2;
#d = (d + x + (31 * m) / 12) % 7;
*/
		int day;
		int month;
		int year;
		int x;
		int y;
		int m;
		int d;
		System.out.println("");
		System.out.println("");

		System.out.println("Welcome to the fastest way to get the day of the week of any occurence based on your input of the date. Viola!");

		System.out.println("");
		System.out.println("");
		System.out.println("Enter the numeric value of the day: ");
		day = Integer.valueOf(console.nextLine());
		System.out.println("");
		System.out.println("Enter the numeric value of the month: ");
		month = Integer.valueOf(console.nextLine());
		System.out.println("");
		System.out.println("Enter the numeric value of the year: ");
		year = Integer.valueOf(console.nextLine());
		y = year - (14 - month) / 12;
		x = y + (y / 4) - (y / 100) + (y / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;
		System.out.println("");
		System.out.println("");
		if (d == 0)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Sunday.");
		}
		else if (d == 1)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Monday.");
		}
		else if (d == 2)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Tuesday.");
		}
		else if (d == 3)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Wednesday.");
		}
		else if (d == 4)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Thursday.");
		}
		else if (d == 5)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Friday.");
		}
		else if (d == 6)
		{
			System.out.println("Gregorian calendar says that " + day +"/"+month+"/"+year + " is on Saturday.");
		}

	}
}
