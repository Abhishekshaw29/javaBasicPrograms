import java.util.*;
public class linearserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] =new int [n];
        for(int i = 0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        boolean flag = false;
        int element = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(ar[i] == element){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }

    }
}
