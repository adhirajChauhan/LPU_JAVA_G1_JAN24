// class A{
//     void show(){
//         System.out.println("From A");
//     }
// }

// class B{
//     void show(){
//         System.out.println("From B");
//     }
// }

interface A{
    // void show();
    void display();
}

interface B{
    void show();
}


class C implements A,B{
    public void show(){
        System.out.println("Show From C");
    }

    public void display(){
        System.out.println("Display form C");
    }
}

class LPU{
    public static void main(String args[]){
        C c1 = new C();

        c1.display();
        c1.show();
    }
}
