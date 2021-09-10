import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] =new int [n];
        for(int i = 0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        boolean flag = false;
        int element = sc.nextInt();
        int low = 0;
        int high = ar.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(element == ar[mid]){
                flag = true;
                System.out.println(mid);
                break;
            }
            else if(element>ar[mid]){
                low = mid+1;
            }
            else if(element<ar[mid]){
                high = mid - 1;
            }
            if(low == high){
                System.out.println("-1");
                break;
            }
        }
    }
    
}
