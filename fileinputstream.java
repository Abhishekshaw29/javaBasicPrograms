import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) {
        try {
        FileInputStream file = new FileInputStream("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
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
    } catch (Exception e) {
        //TODO: handle exception
    }
    }
}
