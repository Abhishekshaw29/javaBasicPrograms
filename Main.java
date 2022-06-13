import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int flag = 1;
        int codenum = sc.nextInt();
        int br[] = { 0, 0, 0 };
        int c = 0;
        for (int i = 0; i < n; i++) {
            br[c] = ar[i];
            c++;
            if (c == 3) {
                if (find(codenum, ar)) {
                    c = 0;
                } else {
                    flag = 0;
                    break;
                }
            }

        }
        if (flag == 0) {
            System.out.println(flag);
        } else {
            System.out.println(flag);
        }

    }

    public static boolean find(int n, int ar[]) {
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            if (ar[i] == n) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return true;
        } else
            return false;

    }
}
