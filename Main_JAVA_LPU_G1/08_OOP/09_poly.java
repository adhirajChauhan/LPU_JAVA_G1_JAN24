class Student{
    void Study(){
        System.out.println("Studying ");
    }
}

class Student1 extends Student{
    void Study(){
        System.out.println("Studying 1");
    }
}

class LPU{
    public static void main(String args[]){
        //polymorphism
        //many forms

        // int a = 5;
        // int b = 10;
        // System.out.println(a + b);

        // String c = "Hello ";
        // String d = "World";
        // System.out.println(c + d);

        Student s1 = new Student1();

        s1.Study();
    }
}


//Types - 
// 1. Static Polymorphism (Early binding) -> is a type of polymorphism that resolves at compile time.
// -> Method overloading is an example.

//2. Dynamic Polymorphism(Late Binding) -> is a type of polymorphism that resolves at the runtime.
// -> Method overriding is an example.
