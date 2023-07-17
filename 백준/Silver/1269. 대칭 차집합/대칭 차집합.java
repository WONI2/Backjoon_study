
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        HashMap<Integer, Integer> arrA = new HashMap<>();
        int[] arrA1 = new int[num1];
        for(int i = 0; i < num1; i++) {
            int A = sc.nextInt();
            arrA.put(A, A);
            arrA1[i] = A;
        }

        HashMap<Integer, Integer> arrB = new HashMap<>();
        int[] arrB1 = new int[num2];
        for(int i = 0 ; i < num2; i++) {
            int B = sc.nextInt();
            arrB.put(B,B);
            arrB1[i] = B;
        }

        int sum1 = 0;
        for(int i = 0 ; i< arrA.size(); i++){
            if(arrB.get(arrA1[i]) != null) {
                sum1++;
            }
        }

        int sum2 = 0;
        for(int i = 0; i < arrB.size(); i++){
            if(arrA.get(arrB1[i]) != null) {
                sum2++;
            }
        }


        bw.write(String.valueOf((arrA.size()-sum1) + (arrB.size()-sum2)));

        bw.flush();


    }

}
