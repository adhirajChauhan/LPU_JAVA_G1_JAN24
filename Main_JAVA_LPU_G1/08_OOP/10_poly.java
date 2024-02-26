class Bank{
    float interest(){
        return 0;
    }
}

class Bank1 extends Bank{
    float interest(){
        return 7.2f;
    }
}

class Bank2 extends Bank{
    float interest(){
        return 10.0f;
    }
}

class LPU{
    public static void main(String args[]){
        Bank b1;

        b1 = new Bank1();
        System.out.println(b1.interest());
        
        b1 = new Bank2();
        System.out.println(b1.interest());

    }
}
