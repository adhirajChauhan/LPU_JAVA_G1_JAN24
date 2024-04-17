import java.io.File;
import java.util.Scanner;

class LPU{
    public static void main(String args[]){

        try{
            File file = new File("MyFile.txt");

            Scanner sc = new Scanner(file);
    
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close(); 
        }

        catch(Exception e){
            System.out.println("Unexpected error");
        }

    }
}
