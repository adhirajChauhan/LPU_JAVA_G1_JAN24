
class A{
    void hello()
    {
        System.out.println("Hello");
    }

    static class B{
        void print(){
            System.out.println("Print");
        }
    }
}

class LPU{
    public static void main(String args[]){
        A obj = new A();
        // B obj1 = new B();

        // A.B obj1 = obj.new B(); //non static inner class

        A.B obj1 = new A.B(); //static inner class

        obj.hello();

        obj1.print();

    }
}
