import java.util.*
;public class factorial {
    public static void main(String[] args) {
        
        // Scanner sc =  new Scanner(System.in);
        // int n = sc.nextInt();
        // int f=1;
        // for(int i=1;i<=n;i++){
        //     f = f*i;
        // }
        // System.out.println(f);
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }

    }
}
