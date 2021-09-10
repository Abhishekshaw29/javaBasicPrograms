import java.util.*;
public class insetrion{

    //insert an element to an sorted array in its correct postion from an unsorted array.
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]  = sc.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = key;
        }

        for (int i = 0; i < ar.length; i++) {
           System.out.println(ar[i]);
        }
    }
}
