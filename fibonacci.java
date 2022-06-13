import java.util.Scanner;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        fibobyloop(range);
        // for (int i = 0; i < range; i++) {
        // System.out.println(fibobyrecursion(i));
        // }

    }

    public static void fibobyloop(int num) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < num; i++) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;

        }

    }

    public static int fibobyrecursion(int num) {

        if (num == 0) {
            // 0 1 1 2 3 5 .......
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }

        return fibobyrecursion(num - 2) + fibobyrecursion(num - 1);
    }
}