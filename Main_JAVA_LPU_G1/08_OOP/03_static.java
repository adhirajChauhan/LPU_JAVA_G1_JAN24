class Student{

    public String studentName;
    public int rollNo;
    public static String uniName;

    public void output(){
        System.out.println(studentName + " " + rollNo + " " + uniName);
    }

    public static void myStaticMethod(Student obj){
        System.out.println("From static method " + uniName + " " + obj.rollNo);
    }
}

class LPU{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.studentName = "Kartik";
        s1.rollNo = 1;
        Student.uniName = "LPU";

        Student s2 = new Student();
        s2.studentName = "Tanishk";
        s2.rollNo = 2;
        Student.uniName = "LPU";

        Student.uniName = "LPU";
        s1.output();
        s2.output();

        Student.myStaticMethod(s2);
    }
}


//Static keyword for memory managment.
//A static variable can be used to refer to the common property of all objects
//a static variable gets memory only once in class area at the time of class loading


//Difference in instance var and static var
/*
    - Instance variables(IV) are declared in a class but outside a method
    - Class/static variables(SV) are declared with a static keyword in a class but outside a method

    - IV are created when an object is created with the use of "new" keyword and they get destroyed when the object is destroyed
    - SV are created when the program starts and destroyed when the program stops

    - IV can be accessed directly by calling variable name inside the class
    - SV can be accessed by calling with the class name
 */
