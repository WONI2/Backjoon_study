import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        int a1 = (a%10)*100
        +((a/10)%10)*10
        +(a/100);
        
        int b1 = (b%10)*100
                +((b/10)%10)*10
                +(b/100);
        
        if(a1>b1) System.out.print(a1);
        else System.out.print(b1);
        
    }
}