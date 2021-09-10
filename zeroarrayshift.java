import java.util.Scanner;
import java.util.*;
public class zeroarrayshift {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int count = 0 ;
        for(int i=0;i<n;i++){
            ar[i]  = sc.nextInt();
        }
        for(int i = 0 ; i<n;i++){
            if(ar[i] != 0){
                ar[count] = ar[i];
                count++;
            }
        }
        while (count<n) {
            ar[count] = 0;
            count++;
        }


        for(int i =0;i<ar.length;i++){
            System.out.print(ar[i] +" ");

        }
    }
}
