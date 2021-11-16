import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Strin1");
        char[] str = sc.nextLine().toCharArray();
        System.out.println("Enter the String2");
        char[] str2 = sc.nextLine().toCharArray();
        int count  = 0;
        //Arrays.sort(str);
        //Arrays.sort(str2);
        if(str.length == str2.length){
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(str[i] == str[j]){
                    count++;
                    System.out.println(count);
                }
            } 
        }

        if(count == str.length){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        } 
    }
    else{
        System.out.println("Not anagram");
    }

    }
}
