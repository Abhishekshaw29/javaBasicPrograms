import java.util.*;
public class strpalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        boolean flag = true;
        for(int i = 0; i < string.length()/2; i++){  
            if(string.charAt(i) != string.charAt(string.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }
        System.out.println(flag);
    }
}
