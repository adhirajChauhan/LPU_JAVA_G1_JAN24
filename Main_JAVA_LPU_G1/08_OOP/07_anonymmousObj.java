class Calculation{
    int a;
    public Calculation(int a){
        this.a = a;
    }

    public void area(){
        int area = a * a;
        System.out.println("Area : " + area);
    }

    public void perimeter(int b){
        int perimeter = 4 * b;
        System.out.println("Perimeter : " + perimeter);
    }
}

class LPU{
    public static void main(String args[]){
        new Calculation(10).area();
    }
}