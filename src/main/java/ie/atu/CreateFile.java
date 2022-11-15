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
                PrintWriter outputWriter = new PrintWriter(new FileWriter (myFile,true));
                outputWriter.println("good");
                outputWriter.println();

            }
            catch (IOException e){

                e.printStackTrace();
            }
        }

    }
}
