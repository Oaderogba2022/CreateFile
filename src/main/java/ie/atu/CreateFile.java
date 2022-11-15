package ie.atu;
import java.io.*;


public class CreateFile {
    public static void main(String[] args) throws IOException {

        {

            File myFile = new File("MyFile.txt");
            myFile.createNewFile();
            System.out.println("My file is located at " +myFile.getAbsolutePath());
            String info = "hello";
            try{
                FileWriter myWriter = new FileWriter(myFile,true);
                myWriter.write("good");
                myWriter.close();

            }
            catch (IOException e){

                e.printStackTrace();
            }
        }

    }
}
