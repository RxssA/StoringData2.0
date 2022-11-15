package ie.atu.week8;


import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        {



            System.out.println("My File is located at " + myFile.getAbsolutePath());
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Entewr the filename: ");
            String filename = keyboard.nextLine();
            Scanner myFile = new Scanner(new  File(filename));
            String content = "Details to write";
            try{
                PrintWriter myWriter = new PrintWriter(myFile);

                myWriter.close();


            }
            catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}