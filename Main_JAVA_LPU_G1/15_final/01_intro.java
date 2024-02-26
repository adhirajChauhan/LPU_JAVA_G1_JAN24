// final class Car{
    // final int price = 100;

    // final void Drive(){
    //     System.out.println("Car is driving");
    // }
// }

// class Ford extends Car{
    // void Drive(){
    //     System.out.println("Ford is driving");
    // }
// }

class Bike{
//     final int num;

    Bike(){

    }
    final void Ride(){

    }
}

// class Yamaha extends Bike{
//     new Yamaha().Ride();
// }

class LPU{
    public static void main(String args[]){
        // Car c1 = new Car();
        // c1.price = 200;
        // Ford f1 = new Ford();

        // f1.Drive();;
    }
}


//If we make a variable as final, we annot change the value of it (constant)
//If we make a method as final, we cannot override it
//If we make a class as final, we cannot extend it


//Can we inherit final method? -> YES