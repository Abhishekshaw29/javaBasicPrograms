import java.util.*;
public class charcount {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String:");
        char [] str = sc.nextLine().toCharArray();
        System.out.println("Enter the char to count:");
        char ch =  sc.next().charAt(0);
        int count = 0;
        for(char c : str ){
            if(ch == c ){
                count++;
            }
        }
        System.out.println("The count is:"+ count);
    }
}
