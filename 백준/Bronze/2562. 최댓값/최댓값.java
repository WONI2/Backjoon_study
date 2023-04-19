
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int max=0;
			int count = 0;
	
		int[] a = new int[9];
		
		for(int i=0; i< 9; i++) {
			a[i] = sc.nextInt();
			if(max <a[i]) {
				max = a[i];
				count = i+1 ;
			}}
		
			System.out.println(max);
			System.out.println(count);
	}
}