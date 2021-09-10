import java.util.*;
import java.io.File;
public class filehandling {
    public static void main(String args[]){
        try {
        File file = new File("C:\\Users\\Abhishek\\Desktop\\Code\\Java Interview sets\\hello.txt");
        if(file.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("File already Exists");
            if(file.exists()){
                System.out.println("File Name"+ file.getName());
                System.out.println("File location"+ file.getAbsolutePath());
                System.out.println("File size"+ file.length());
                System.out.println("File Readible"+ file.canRead());
                System.out.println("File Writable"+ file.canWrite());
              //  System.out.println("Delete file"+ file.delete());

            }
            else{
                System.out.println("no FIle exists");
            }
        }
    }
    catch (Exception e) {
        //TODO: handle exception
        System.out.println(e.getMessage());
    }

    }
}
