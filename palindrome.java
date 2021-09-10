import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num;
        int sum =0;
        while(num>0){
            int temp = num%10;
            sum = sum*10+temp;
            num/=10;
    }
    if(sum == t ){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }

    }
}
