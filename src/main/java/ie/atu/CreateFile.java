package ie.atu;
import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter name of file");
            String filename = input.nextLine();
            File myFile = new File(filename);
            myFile.createNewFile();
            System.out.println("My file is located at " +myFile.getAbsolutePath());
            String info = "hello";
            try{

                PrintWriter outputWriter = new PrintWriter(new FileWriter (filename,true));
                outputWriter.println("bye");
                outputWriter.println();
                outputWriter.close();
                Scanner input1 = new Scanner(new File(filename));
                while(input1.hasNext()){
                    String str1 = input1.nextLine();
                    System.out.println(str1);
                }
                input1.close();

            }
            catch (IOException e){

                e.printStackTrace();
            }
        }

    }
}
