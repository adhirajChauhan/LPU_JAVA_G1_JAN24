abstract class Car{

    void Drive(){
        System.out.println("Drive");
    }

    void Brake(){ //concrete methods
        System.out.println("Brake");
    }

    abstract void Speed();
}

class Ford extends Car{
    void Speed(){
        System.out.println("Speed");
    }
}

class LPU{
    public static void main(String args[]){
        Car c1 = new Ford(); 
        c1.Drive();
        c1.Speed();
    }
}


//Abstract class -> An abstract class must be declareed with abstract keyword
// It can have abstract and non abstract methods.
//It cannot be instantiated
//It can have constructors and static methods



// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.




//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.