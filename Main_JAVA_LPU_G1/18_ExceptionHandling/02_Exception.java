class LPU{
    public static void main(String args[]){

        try{
            String str = null;
            System.out.println(str.length());
            
            int arr[] = new int[5];
            arr[6] = 100;
        }

        catch(ArithmeticException e){
            System.out.println("In Arithmetic block");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("In Array Exception block");
        }
        catch(Exception e){
            System.out.println("in exception block");
        }
    }
}
