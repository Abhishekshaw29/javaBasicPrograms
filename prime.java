import java.util.Scanner;
import java.math.*;

public class prime {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int low = sc.nextInt();
            int high = sc.nextInt();
            for (int i = low; i < high; i++) {
                    if(isprime(i)){
                        System.out.println(i);
                    }
            }
        }
        public static boolean isprime(int n){
           boolean flag = true;
           if(n == 1){
               flag = false;
           }
           else{
            for(int i = 2;i<n;i++){
                if(n%i==0){
                    flag = false;
                    break;
                }
            }
        }
            return flag;
        }
}
