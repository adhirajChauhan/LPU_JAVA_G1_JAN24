abstract class A {

    abstract void print();
    abstract void test();
}

// class B extends A{
//     void print(){
//         System.out.println("Hello");
//     }
// }
class LPU{
    public static void main(String args[]){
        A obj = new A(){
            void print(){
                System.out.println("Hello again");
            }

            void test(){
                System.out.println("Testing");
            }
        };

        obj.print();
        obj.test();
    }
    
}