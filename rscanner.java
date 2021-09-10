import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rscanner {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
        Scanner sc;
        try {
            String str="";
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                str  = sc.next();
                System.out.print(str);
            }
           
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
