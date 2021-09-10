import java.util.*;
public class primefactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 2;i<=number;i++){
            while(number%i==0){
                System.out.println(i);
                number=number/i;
            }
        }
    }
    
}
