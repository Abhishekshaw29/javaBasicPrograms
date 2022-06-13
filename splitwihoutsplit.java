import java.util.*;
public class splitwihoutsplit{

    public static void main(String args[]) {
    
        int i, index = 0;
        List<String> words = new ArrayList();
        Scanner in = new Scanner(System.in);    
        
        System.out.println("Enter the sentence:");
        String text = in.nextLine();    
            
        for(i = 0; i < text.length(); i++) {
          
          if(text.charAt(i) == ' ') {  
            words.add(text.substring(index, i));
            index = i + 1;
          }
        }
        words.add(text.substring(index));
        
        System.out.println("\nWords in the sentence are....");
        
        for(String s: words) {
          
          System.out.println(s);
        }
        
        System.out.println("Total no. of words in given sentence = " + words.size());
      }
    }


