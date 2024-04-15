import java.util.TreeSet;
class LPU{
    public static void main(String args[]){
        TreeSet<Integer> set1 = new TreeSet();

        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(9);
        set1.add(12);

        TreeSet<Integer> set2 = new TreeSet();

        set1.add(9);
        set1.add(12);
        set1.add(14);


        // System.out.println("Before : " + set1);

        // System.out.println(set1.first());
        // System.out.println(set1.last());

        // System.out.println(set1.higher(2));
        // System.out.println(set1.lower(5));

        // System.out.println(set1.ceiling(5));
        // System.out.println(set1.floor(5));

        // System.out.println("Removed : " + set1.pollFirst());
        // System.out.println("Removed : " + set1.pollLast());

        // System.out.println(set1.headSet(5));
        // System.out.println(set1.headSet(5, true));

        // System.out.println(set1.tailSet(5));
        // System.out.println(set1.tailSet(5, true));

        // System.out.println(set1.subSet(3, 12));
        // System.out.println(set1.subSet(3, true, 12, true));

        System.out.println(set1.addAll(set2));

        System.out.println("After : " + set1);

    }
}



// Write a Java program to get the element in a tree set strictly greater than or equal to the given element.