class Calculate{

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a+b;
    }

}


class LPU{
    public static void main(String args[]){
        int num1 = 5;
        int num2 = 10;
        int num5 = 7;

        double num3 = 4.4;
        double num4 = 5.7;
        // int result = num1 + num2;
        // System.out.println(result);

        Calculate obj1 = new Calculate();

        var output = obj1.add(num1,num4);
        System.out.println(output);
    }
}

//Method overloading
/*
    when a class has multiple methods with same name but different parameters.

    overloading can be done - 
        - by changing the number of arguments
        - by changing the data type
 */