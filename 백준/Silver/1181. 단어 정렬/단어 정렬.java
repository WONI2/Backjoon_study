
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++ ) {
           set.add(sc.nextLine());
        }

        int size = set.size();
        String[] arr = new String[size];
        set.toArray(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }

            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s).append('\n');

        }
        System.out.println(stringBuilder);

    }

}
