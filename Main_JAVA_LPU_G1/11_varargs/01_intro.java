class Test{
    public int add(int ... num){ 
        int sum = 0;
        for(int i : num){
            sum += i;
        }
        return sum;
    }
}

class LPU{
    public static void main(String args[]){
        Test obj = new Test();

        System.out.println(obj.add(2, 3, 10));
    }
}
