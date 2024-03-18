@FunctionalInterface
interface A{
    int add(int i, int j);
}

class LPU{
    public static void main(String args[]){
        // A obj = new A() {
        //     public int add(int i, int j){
        //         return i + j;
        //     }
        // };

        // A obj = (int i, int j) -> {return i + j;};

        A obj = (i,j) -> i + j;

        System.out.println(obj.add(2, 4));
    }
}











//Write a JAVA program using lambda expression to check if a number is even



