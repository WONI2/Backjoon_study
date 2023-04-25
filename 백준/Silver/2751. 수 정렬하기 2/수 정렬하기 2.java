import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i<N) {
        	list.add(sc.nextInt());
        	i++;
        }
        Collections.sort(list);
    
       for(int value : list) {
    	   sb.append(value).append('\n');
       }
    System.out.println(sb);
    }
}