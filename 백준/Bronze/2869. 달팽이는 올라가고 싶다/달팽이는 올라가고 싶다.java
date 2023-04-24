import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int night = sc.nextInt();
		int endday = sc.nextInt();
		
		int days = ((endday-night) /(day-night)); 
		
		if((endday - night)%(day - night) != 0) {
			days++;
		}
		
		
		System.out.println(days);
		
	}
}