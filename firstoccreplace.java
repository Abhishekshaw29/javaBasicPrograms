import java.util.*;
public class firstoccreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char num = sc.next().charAt(0);
        char newnum = sc.next().charAt(0);
        for(int i=0;i<str.length;i++){
            if(str[i] == num){
               str[i] =  newnum;
               break;
            }
        }
        String s = String.valueOf(str);
        System.out.println(s);
        
    }
}
