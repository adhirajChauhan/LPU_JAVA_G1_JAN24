interface Food{
    // public static final int x = 5;
    // public abstract void eat();
    void eat();

}

class Nonveg implements Food{
    public void eat(){
        System.out.println("Non veg food");
    }
}

class Veg implements Food{
    public void eat(){
        System.out.println("Veg food");
    }
}

class Icecreams implements Food{
    public void eat(){
        System.out.println("Eating ice cream");
    }
}

class Dog{
    void eating(Food item){
        item.eat();
    }
}

class LPU{
    public static void main(String args[]){
        Dog d1 = new Dog();

        Veg v1 = new Veg();

        Nonveg n1 = new Nonveg();

        Icecreams c1 = new Icecreams();

        d1.eating(v1);
        d1.eating(n1);
        d1.eating(c1);
    }
}




// Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.