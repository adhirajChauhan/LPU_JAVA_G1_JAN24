class Phone{
    String model;
    int price;
    String customerName;
    
    public String toString() {
        return "Phone [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Phone other = (Phone) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public String toString(){
    //     return "Hello";
    // }

    
    // public boolean equals(Phone other){
    //     if(this.model.equals(other.model) && this.price == other.price){
    //         return true;
    //     }
    //     else return false;
    // }
    
}

class LPU{
    public static void main(String args[]){
        Phone obj = new Phone();
        obj.model = "iphone";
        obj.price = 100;
        obj.customerName = "Hey";

        Phone obj1 = new Phone();
        obj1.model = "iphone";
        obj1.price =  100;
        obj.customerName = "Hi";
        
        boolean check = obj.equals(obj1);

        // System.out.println(obj);
        // System.out.println(obj1);

        System.out.println(check);

    }
}
