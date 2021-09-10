import java.util.*;
import java.math.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low  = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            if(armstrongcheck(i)){
                System.out.println(i);
            }
            
        }
        
    }
    public static boolean armstrongcheck(int n ){
        int temp, digits=0, last=0, sum=0;   
        temp=n;     
        while(temp>0)    
        {   
        temp = temp/10;   
        digits++;   
        }   
        temp = n;   
        while(temp>0)   
        {    
        last = temp % 10;    
        sum +=  (Math.pow(last, digits));      
        temp = temp/10;   
        }  
        if(n==sum)     
        return true;        
        else return false;   
           
    }
}
