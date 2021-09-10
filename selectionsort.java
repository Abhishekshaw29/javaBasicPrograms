import java.util.*;
public class selectionsort{
//find the minm element in the unsorted array
// and swap it with element at start.

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]  = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                  ar[i] = ar[i] + ar[j];
                  ar[j] = ar[i] - ar[j];
                  ar[i] = ar[i] - ar[j];

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ar[i]);
        }
    }
}
