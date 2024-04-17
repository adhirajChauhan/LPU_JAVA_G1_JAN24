import java.io.File;

class LPU{
    public static void main(String args[]){
        File file = new File("MyFile.txt");

        if(file.delete()) System.out.println("File deleted sucessfully");
        else System.out.println("Some error");
        
    }
}
