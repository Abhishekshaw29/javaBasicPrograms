import java.util.*;
public class findfactnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        if(num>0){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                num=num/i;
            }
            else{
                break;
            }
            
        }


        if(num == 1){
            System.out.println(count);
        }
        else{
            System.out.println("Not perfect factorial");

        }
    }
    else if(num<=0){
        System.out.println("invalid input");

    }

    }
}
