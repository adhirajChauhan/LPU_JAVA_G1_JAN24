
class Address{
    String city;
    String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }
}
class Student{
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("ID : " + id  + " | " + "name : " + name + "address : " + address.city);
    }
}

class LPU{

    public static void main(String argsp[]){

        Address a1 = new Address("City", "State");

        Student s1 = new Student(1, "John", a1);

        s1.display();
    }
}