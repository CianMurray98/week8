import java.io.*;
import java.nio.file.Path;
import java.io.FileWriter;


public class CreateFile {
    public static void main(String[] args)
    {

            File myFile = new File("MyFile.txt");
            System.out.println("My File is located at " + myFile.getAbsolutePath());
            String content = "Details to Write:";
            try{
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("hhh\n");
                myWriter.write("ggg\n");
                myWriter.close();
            } catch(IOException e){
                e.printStackTrace();
            }
    }
}
