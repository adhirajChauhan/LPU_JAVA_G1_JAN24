class Person{


    public String name;
    public int age;
    public int mob;

    public Person(){
        System.out.println("From Constructor");
        name = "Hello";
        age = 11;
        mob = 1234;
    }

    public Person(String name, int age, int mob){
        this.name = name;
        this.age = age;
        this.mob = mob;

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person obj, Person obj1){
        name = obj.name;
        age = obj1.age;
        mob = obj.mob;
    }


    // public void output(){
    //     System.out.println("Name : " + name + " Age : " + age + " Mob : " + mob);
    // }
}

class LPU{
    public static void main(String args[]){

        //constructors
        Person p1 = new Person("Jim", 22, 123);
        Person p2 = new Person("John", 33);
        Person p3 = new Person();

        Person p4 = new Person(p1,p2);

        System.out.println(p4.age);
    }

}



/*
    - A constructor is a block of code similar to a class
    - It is called when an instance of a class is created
    - Every time an object is created using the new keyword, at least one constructor is called.
    - Java compiler provides a default constructor by default, this constructor is called is there is no constructor available in the class.

    Rules - 
    - Constructor name must be same as its class name
    - Constructor should have no return type.
 */




 
 //  Create a Java program to model a simple car rental system. The system should allow users to rent a car and display the details of rented cars.

// Your task is to implement a Car class with the following specifications:

// The Car class should have private instance variables for color, model, year, and rentalStatus.
// It should have a constructor that initializes color, model, and year when a new Car object is created, and sets rentalStatus to false initially.
// Implement getter methods to retrieve the values of the instance variables.