import java.util.*;
public class perfectnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low =sc.nextInt();
        int high =sc.nextInt();
        for(int i = low ;i<=high;i++){
            if(perfectcheck(i)){
                System.out.println(i);
            }
        }
       

    }
    public static boolean perfectcheck(int n){
        int sum = 0;
        for(int i =1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum)
            return true;
        else 
            return false;
    }
}