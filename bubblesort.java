import java.util.*;
public class bubblesort{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int ar[] = new int[num];
        for(int i=0;i<num;i++){
            ar[i]  = sc.nextInt();
        }
        int n = ar.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (ar[j] > ar[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }

        
        


        


    }
}
