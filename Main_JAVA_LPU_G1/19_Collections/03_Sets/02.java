import java.util.HashSet;
import java.util.Iterator;


class LPU{
    public static void main(String args[]){
        HashSet<Integer> set1 =  new HashSet();

        set1.add(2);
        set1.add(2);
        set1.add(4);
        set1.add(5);

        System.out.println(set1);

        // Iterator<Integer> itr = set1.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // HashSet<Integer> set2 = new HashSet();

        // set2.add(5);
        // set2.add(4);
        // set2.add(8);
        
        //common elements between 2 sets
        // set1.retainAll(set2);

        // set1.removeAll(set2);
        // System.out.println(set1);

    }
}
