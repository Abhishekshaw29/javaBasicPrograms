import java.util.*;
public class factorial{
    public static void main(String[] args) {
        int f=1;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fact(n));
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
    public static int fact(int n){
        if(n==0 || n == 1)
        return 1;
        else{
            return n*fact(n-1);
        }
    }
}
