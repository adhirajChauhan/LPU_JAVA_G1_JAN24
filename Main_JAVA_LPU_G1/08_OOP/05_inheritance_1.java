// class Animal{

//     public void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal
// {

//     public  void bark(){
//         System.out.println("I can bark");
//     }

// }

//SINGLE

//-----------------------------------------------------------------

// class Animal{

//     public void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal{
//     public void bark(){
//         System.out.println("I can bark");
//     }
// }

// class BabyDog extends Dog{
//     public void cry(){
//         System.out.println("i can cry");
//     }
// }

//Multi Level

//-----------------------------------------------------------------

// class Animal{

//     public void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal{
//     public void bark(){
//         System.out.println("I can bark");
//     }
// }

// class Tiger extends Animal{
//     public void roar(){
//         System.out.println("I can roar");
//     }
// }

//Hierarchical
//-----------------------------------------------------------------

// class A{
//     void print(){
//         System.out.println("from A");
//     }
// }

// class B{
//     void print(){
//         System.out.println("from B");
//     }
// }


class LPU{
    public static void main(String args[]){
        //inheritance

    }
}








// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.