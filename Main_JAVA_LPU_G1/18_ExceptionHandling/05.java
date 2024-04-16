class Test{
    public void test(int data){
        if(data > 100){
            throw new ArithmeticException("value more than 100 not allowed");
            // System.out.println("1");
        }
        else{
            System.out.println("Its ok");
        }

        // System.out.println("2");

    }
}

class LPU{
    public static void main(String args[]){
        Test t1 = new Test();

        t1.test(12);
    }
}
