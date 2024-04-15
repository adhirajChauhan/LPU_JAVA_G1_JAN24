// class GenericClass<T>{
//     T data;

//     public GenericClass(T data){
//         this.data = data;
//     }

//     public T getData(){
//         return this.data;
//     }

// }

// class Test{
//     public <T> void genericMethod(T data){
//         System.out.println("From generic method : " + data);
//     }

    
// }

class GenericClass<T extends Number>{

    void print(){
        System.out.println("From Bounded generic class");
    }
}

class LPU{
    public static void main(String args[]){
        // GenericClass<Integer> obj1 = new GenericClass(5);
        // System.out.println(obj1.getData());

        // GenericClass<String> obj2 = new GenericClass("Hello");
        // System.out.println(obj2.getData());

        // Test t1 = new Test();

        // t1.<Integer>genericMethod(5);

        // t1.<String>genericMethod("Hello");

        // t1.genericMethod(5);

        // t1.genericMethod("Hello");

        GenericClass<Integer> obj1 = new GenericClass();

    }
}



//Code Reusability -> with the help of generics we can write code that will work with different type of data.

//Compile - time type checking
