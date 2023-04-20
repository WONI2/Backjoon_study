import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            String a = sc.next();
            int s = a.length();
            String f = String.valueOf(a.charAt(0));
            String l = String.valueOf(a.charAt(s-1));
            System.out.println(f+l);
        }
    }
}