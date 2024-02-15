class LPU{
    public static void main(String args[]){

        // int a = 5;
        //Integer myInt = Integer.valueOf(a); //boxing
        // Integer myInt1 = a; // auto-boxing -> automatic conversion of primitive data type into its corresponding wrapper class


        Integer a = 5;

        int y = a.intValue(); // unboxing
        int x = a; // auto - unboxing -> the automatic conversion of wrapper type into its corresponding primitive type


        System.out.println(x);
    }
}

//Wrapper classes provides the mechanasim to convert primitive into objcets, and object into primitive
