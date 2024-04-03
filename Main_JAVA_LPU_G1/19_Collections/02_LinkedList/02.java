import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class LPU{
    public static void main(String args[]){
        // Queue<String> ll1 = new LinkedList<>();

        // ll1.add("Mercury");
        // ll1.add("Venus");
        // ll1.add("Earth");
        // ll1.add("Mars");

        // // System.out.println(ll1.peek());

        // // System.out.println(ll1.poll());
        
        // ll1.offer("Jupiter");
        
        // System.out.println(ll1);

        Deque<String> ll1 = new LinkedList<>();

        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");

        ll1.addFirst("Jupiter");

        ll1.addLast("Saturn");

        ll1.removeLast();

        System.out.println(ll1);


    }
}




//LinkedList
// - Implements List, Queue and Dequeue interface
// - Stores 3 values (prev add, data, next add)
// - Provides doubly LL implementation
// - When an element is added, prev and next address are changes


//ArrayList
// - Implements List Interface
// - Stores single value
// - Provides resizable array implementation
// - When an element is added, all elements after that position are shifted
