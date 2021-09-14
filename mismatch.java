import java.util.Scanner;

public class mismatch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char[] str1 = sc.nextLine().toCharArray();
            char[] str2 = sc.nextLine().toCharArray();
            int k = sc.nextInt();
            System.out.println(spellcheck(k,str1,str2));
        }

        public static int spellcheck(int k ,char[] str1,char[] str2){
            int count = 0;
            for (int i = 0; i <str1.length; i++) {
                if(str1[i] != str2[i]){
                    count++;
                }
            }
            int b=0;
            if(count == 0){
                b = 1;
            }
            else if(count<k){
                b = 2;
            }
            else if(count==k){
                b =  3;
            }
            else if(count>k){
                b =  4;
            }
            return b;
        }

}
