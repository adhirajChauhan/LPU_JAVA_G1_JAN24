interface A{
    void print();
}

interface B extends A{
    void show();
}

class MyClass implements B{
    public void show(){
        System.out.println("From Show");
    }

    public void print(){
        System.out.println("From print");
    }
}

class LPU{
    public static void main(String args[]){
        MyClass obj = new MyClass();

        obj.print();
        obj.show();
    }
}
