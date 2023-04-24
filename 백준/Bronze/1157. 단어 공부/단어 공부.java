import java.util.Scanner;

public class Main {
    
    
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine().toUpperCase();
		
		int[] abc = new int[26];
		
		for(int i = 0; i< word.length(); i++) {
			int num = word.charAt(i)-'A';
			abc[num]++;
		}
		int max = 0;
		char res = '?';
		for(int i =0; i<abc.length; i++) {
			if(max < abc[i]) {
				max = abc[i];
				res = (char)(i+'A');
			}else if(max == abc[i]) {
				res = '?';
			}
		}
		System.out.println(res);
       
    }
}