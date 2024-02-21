class Bank{

    public int getLoanInterest(){
        return 0;
    }

}

class ICICI extends Bank{
    public int getLoanInterest(){
        return 10;
    }
}

class SBI extends Bank{

}

class LPU{
    public static void main(String args[]){
        ICICI bank1 = new ICICI();

        System.out.println(bank1.getLoanInterest());
    }
}

//Method overriding is used to provide specific implementation of the method that is already provided by its parent class.

//The method must have the same name as is the parent class
//The method must have same parameters as in the parent class