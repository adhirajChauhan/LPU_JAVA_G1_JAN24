import java.util.LinkedList;

class LPU{
    public static void main(String args[]){

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");

        System.out.println("Original LinkedList : " + ll1);
        
        // ll1.get(1);

        // ll1.set(1, "test");

        ll1.remove(1);
        
        System.out.println("Modified LinkedList : " + ll1);

    }
}

//Elements in LL are nit stored in a sequence, they are scattered and connected through "prev" and "next" links.
