@FunctionalInterface
interface A{
    // void display();

    void print(int i);
}

// class B implements A{
//     public void display(){
//         System.out.println("From B");
//     }
// }


class LPU{
    public static void main(String args[]){
        // A obj = new A()
        // {
        //     public void display(){
        //         System.out.println("From main");
        //     }
        // };

        //void return type and no parameters
        // A obj = () -> {System.out.println("From main");}; //for multiple statements in the body

        // A obj = () -> System.out.println("From main");

        
        //with parameters

        // A obj = (int i) -> System.out.println("From print " + i);

        //no need of argument data type
        // A obj = (i) -> System.out.println("From print " + i);  <==


        //we can remove datatype of argument and paranthesis is case of single argument
        // A obj = i -> System.out.println("From print " + i);

        //for multiple arguments, we have to write them in paranthesis
        // A obj = (i,j) -> System.out.println("From print " + i + " " + j);


        // obj.print(5);
    }
}
