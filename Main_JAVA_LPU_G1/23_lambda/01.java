@FunctionalInterface
interface Test{
    int calc();
}

class LPU{
    public static void main(String args[]){

        Test obj;

        obj = () -> 10;

        System.out.println(obj.calc());

    }
}
