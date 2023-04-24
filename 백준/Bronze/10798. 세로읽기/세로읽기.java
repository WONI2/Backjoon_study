import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
       String s;
       char[][] a = new char[5][15];
       
       for(int i =0; i<5; i++) {
    	   s = br.readLine();
    	   for(int j = 0; j <s.length(); j++) {
    		   a[i][j] = s.charAt(j);
    	   }
       }
       
       for(int i = 0; i< 15; i++) {
    	   for(int j =0; j<5; j++) {
    		   if(a[j][i]== ' ' || a[j][i] == '\0' ) {
    			   continue;
    		   }
    		   System.out.print(a[j][i]);
    	   }
    	   
       }
       
       
       
    }
}