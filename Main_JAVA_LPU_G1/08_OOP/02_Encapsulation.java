class Bank{

    private int accNumber;
    private String myName;
    // private int amount;

    public int getAccNumber(){
        return accNumber;
    }

    public String getName(){
        return myName;
    }

    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }

    // public void setName(String myName, Bank obj){
    //     Bank obj1 = obj;
    //     obj1.myName = myName;
    // }

    public void setName(String myName){
        
        this.myName = myName;
    }
}


class LPU{
    public static void main(String args[]){

        
        Bank obj1 = new Bank();
        
        // obj1.getAccNumber();
        obj1.setName("Hello");
        System.out.println(obj1.getName());

        obj1.setAccNumber(2222);
        // System.out.println(obj1.getAccNumber());
        
        // obj1.amount = 500;
        
        // System.out.println(obj1.getAccNumber()+ " " + obj1.getName()); //+ " " + obj1.amount);
    }
}

//Encapsulation -> wrapping data and member functions together in a single unit
//It provides control over the data
//It is a way of achieving data hiding because other classes will not be able to access the data through private data members

