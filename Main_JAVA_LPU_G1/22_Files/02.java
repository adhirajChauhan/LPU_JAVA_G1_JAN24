import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class LPU{
    public static void main(String args[]){

        try{

            FileWriter fw = new FileWriter("MyFile.txt");

            fw.write("Writing some demo text");

            fw.close();
            System.out.println("Closed successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }

        
        
    }
}
