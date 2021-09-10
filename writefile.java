import java.io.FileWriter;
public class writefile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
            try {
                file.write("hello world genc next is here i can do it.");
            }
            catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            finally{
                file.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
