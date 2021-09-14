import java.util.Scanner;

public class numpalin {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while (num!=0){
            int temp = num%10;
            result = temp + result*10;
            num/=10;
        }
        System.out.println(result);
    }
}
