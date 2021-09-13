import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(bin(number));
    }
    public static int bin(int n){
        int i =1;
        int binarynum = 0;
        while(n!=0){
        int temp = n%2;
        n=n/2;
        binarynum  = binarynum + temp*i;
        i*=10;
    }
        return binarynum;
    }
    
}
