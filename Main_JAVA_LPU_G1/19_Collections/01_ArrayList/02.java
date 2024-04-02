import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class LPU{
    public static void main(String args[]){

        //convert arraylist to an array
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Mercury");
        list1.add("Venus");
        list1.add("Earth");
        list1.add("Mars");

        // String arr[] = new String[list1.size()];

        // list1.toArray(arr);

        // for(String str : arr){
        //     System.out.println(str);
        // }

        //convert to string
        // System.out.println(list1.toString());

        //convert array to arrayList
        // String arr[] = {"Mercury", "Venus", "Earth"};

        // ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

        // System.out.println(list1);

    }
}






// Create a Java program to manage a list of student names using ArrayList. The program should allow users to add new student names, remove existing student names, and display all student names.

// Your program should include the following methods:

// addStudent(String name): This method adds a new student name to the list.
// removeStudent(String name): This method removes a student name from the list.
// displayAllStudents(): This method displays all the student names stored in the list.
// Write a Java program that implements the above methods and demonstrates their functionality.