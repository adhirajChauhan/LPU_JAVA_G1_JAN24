@FunctionalInterface
interface A{
    void display();
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

        // A obj = () -> {System.out.println("From main");}; //for multiple statements in the body

        A obj = () -> System.out.println("From main");


        obj.display();
    }
}
