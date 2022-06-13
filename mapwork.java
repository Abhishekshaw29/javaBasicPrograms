import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapwork {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int s = sc.nextInt();
            if (!map.containsKey(s)){
              map.put(s, 1);
            }
            else {
              int count = map.get(s);
              map.put(s, count + 1);
            }
          }

          map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
          
    }
}
