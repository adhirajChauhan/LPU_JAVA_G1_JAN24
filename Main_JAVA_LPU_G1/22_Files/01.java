import java.io.File;
import java.io.IOException;

class LPU{
    public static void main(String args[]){

        // try{
            File file = new File("MyFile");

            // if(file.createNewFile()){
            //     System.out.println("File created");
            // }
            // else{
            //     System.out.println("File already exists");
            // }

        // }
        // catch(IOException e){
        //     System.out.println("Unexpected exception occured");
        //     e.getStackTrace();
        // }

        System.out.println(file.getName());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());





    }
}
