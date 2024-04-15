import java.util.Iterator;
import java.util.TreeSet;

class LPU{
    public static void main(String args[]){

        TreeSet<Integer> set1 = new TreeSet();
        set1.add(3);
        set1.add(2);
        set1.add(7);

        
        // TreeSet<Integer> set2 = new TreeSet();
        
        // set2.add(5);
        // set2.add(9);

        
        // set1.addAll(set2);

        // Iterator itr = set1.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        System.out.println(set1.remove(12));

        System.out.println(set1);

    }
}


// Hashset implements Set interface
//No Order

//Treeset implements Set interface and SortedSet interface
//Sorted order (ascending by default)