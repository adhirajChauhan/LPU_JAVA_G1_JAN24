class A{
    void show(){
        for(int i = 0; i<= 10; i++){

            System.out.println("From A");
        }
    }
}

class B{
    void show(){
        for(int i = 0; i <= 10; i++){

            System.out.println("From B");
        }
    }
}

class LPU{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}