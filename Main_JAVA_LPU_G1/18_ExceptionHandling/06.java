class LPU{
    public static void main(String args[]){
        try{
            //other code
            System.out.println("First line");

            try{
                int a = 10/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
                e.getStackTrace();
            }

            try{
                int arr[] = new int[5];

                arr[2] = 10;
            }

            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Remaining code");
    }
}