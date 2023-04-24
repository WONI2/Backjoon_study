import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num[][] = new int [10][10];
        int a =0, b=0;
        int max = 0;
        
        
        for(int i=0;i<9; i++ ) {
        	for(int j =0; j< 9; j++) {
        		num[i][j] = sc.nextInt();
        		if(max < num[i][j]) {
        			max = num[i][j];
        			a = i;
        			b = j;
        			
        		}
        	}
        }
        
        System.out.println(max);
        System.out.println((a+1)+" "+(b+1));
       
        
        
    }
}