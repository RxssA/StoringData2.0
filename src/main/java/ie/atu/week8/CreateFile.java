package ie.atu.week8;


import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        {
            File myFile = new File("Myfile.txt");
            System.out.println("My File is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try{
                PrintWriter myWriter = new PrintWriter(myFile);
                myWriter.println("Chris");
                myWriter.println("Kath");
                myWriter.println("jean");
                myWriter.close();


            }
            catch (IOException e){
                e.printStackTrace();
        }
        }


    }
}