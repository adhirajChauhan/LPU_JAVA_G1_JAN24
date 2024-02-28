class A{
    void print(){
        System.out.println("Hello");
    }

    void run(){
        System.out.println("Running");
    }
}

// class B extends A{
//     void print(){
//         System.out.println("Hey");
//     }
// }

class LPU{
    public static void  main(String args[]){
        A obj = new A(){
            void print(){
                System.out.println("Hey");
            }

            void run(){
                System.out.println("Running fast");
            }
        };

        obj.print();
        obj.run();
    }
}
