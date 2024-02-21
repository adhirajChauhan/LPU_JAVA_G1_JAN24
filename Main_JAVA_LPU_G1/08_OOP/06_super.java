class A{
    public A(){
        super();
        System.out.println("From A");
    }

    public A(int n){
        super();
        System.out.println("From A int");
    }

    public A(int n1, int n2){
        System.out.println("From A2 int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("From B");
    }
    public B(int n){
        super(2,2);
        System.out.println("From B int");
    }
}

class LPU{
    public static void main(String args[]){
        B b = new B(5);
    }
}
