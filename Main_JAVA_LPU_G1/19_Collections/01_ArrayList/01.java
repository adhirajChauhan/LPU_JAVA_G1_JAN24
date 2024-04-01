import java.util.ArrayList;

class LPU{
    public static void main(String args[]){

        // List<String> l1 = new ArrayList<>();

        // ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();

        //add
        list1.add("Mercury");
        list1.add("Venus");
        list1.add("Earth");
        list1.add("Mars");
        
        // System.out.println("Original : " + list1);

        for(String st : list1){
            System.out.println(st);
        }

        //access
        // System.out.println(list1.get(0));

        //change
        // list1.set(2, "Jupiter");

        //remove
        // list1.remove(1);

        //size
        // System.out.println(list1.size());

        //Clone
        // ArrayList<String> list2 = (ArrayList<String>)list1.clone();
        // System.out.println("New list " + list2);

        // System.out.println(list1.contains("Mars"));

        // list1.isEmpty();

        // System.out.println("Modified : " + list1);


    }
}

//ArrayList allows us to create resizable/dynamic arrays






//Write a Java program that swaps two element in an ArrayList