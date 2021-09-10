import java.util.*;
public class stringrev {
    public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
	    String word = sc.nextLine();
	    int n = word.length();
	    String str="";
	    for(int i = n-1;i>=0;i--){
	       str= str+ word.charAt(i);
	    }
	    System.out.println(str);
	    
	}
}
