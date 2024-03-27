class LPU{
    public static void main(String args[]){


        System.out.println("Start Hello");

        try{

            System.out.println("IN TRY 1");

            int a = 2/0;
            // String str = null;
            // System.out.println(str.length());

            // int arr[] = new int[5];
            // arr[10] = 100;

            System.out.println("IN TRY 2");

        }

        catch(ArithmeticException e){
            System.out.println("In catch block " + e);
        }


        // System.out.println(a);

        System.out.println("After exception encountered");
    }
}


//Exception Handling - In this we handle runtime errors and to maintain the normal flow of the application

// try{
    //exception code
//}
//catch(Exception e){
    //handle
//}


//try -> it is used to specify a block where we should place an eception code. It should be followed by a catch block

//catch -> It is used to handle the exception