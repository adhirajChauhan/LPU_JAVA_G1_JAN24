class A{
    public A(){
        super();
        System.out.println("From A");
    }

    public A(int n){
        super();
        System.out.println("From A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("From B");
    }
    public B(int n){
        super(n);
        System.out.println("From B int");
    }
}

class LPU{
    public static void main(String args[]){
        B b = new B(2);
    }
}
