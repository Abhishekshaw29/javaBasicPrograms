import java.io.*;

public class copyoneto {
    public static void main(String[] args) throws IOException {
        try{
        FileInputStream fin = new FileInputStream("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\copy.txt");
        try {
            int i;
            while ((i=fin.read())!=-1){
                fout.write((char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            fin.close();
            fout.close();

        }

       }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    
    }
}
