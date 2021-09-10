import java.io.File;
import java.io.FileReader;
public class readfile {
    public static void main(String[] args) {
      
        try {
            FileReader file = new FileReader("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
            try {
            int i;
            while ((i=file.read())!=-1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            //TODO: handle exception
            e.printStackTrace();
        }
        finally{
            file.close();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
