import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
       String word = br.readLine();
       int result = 1;
       
       for(int i = 0; i < word.length(); i++) {
    	   char a = word.charAt(i);
    	   char b = word.charAt(word.length()-1-i);
    	   if(a != b) {
    		   result = 0;
    	   }
    	   
       }
       System.out.println(result);
       
    }
}