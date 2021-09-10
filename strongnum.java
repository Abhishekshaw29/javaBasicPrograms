import java.util.Scanner;

public class strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp, f, i, r, sum = 0;
        temp = num;
        while (num > 0) {
            i = 1;
            f = 1;
            r = num % 10;
            while (i <= r) {
                f = f * i;
                i++;
            }
            sum = sum + f;
            num = num / 10;
        }
        if(sum==temp){
            System.out.println("yes");
        }
        else
        System.out.println("No");

    }
}
