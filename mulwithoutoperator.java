import java.util.Scanner;

public class mulwithoutoperator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(b<0){
           b = -b;
           a = -a; 
       }
       int res=0;
       for (int i = 1; i <=b; i++) {
           res+=a;
       }
       System.out.println(res);
   } 
}
