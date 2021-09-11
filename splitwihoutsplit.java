import java.util.*;
public class splitwihoutsplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        char c = sc.next().charAt(0);
        String temp = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                temp += str.charAt(i); 
            }
            else{
                System.out.println(temp);
                temp="";
            }
        }
        System.out.println(temp);
    }
}
