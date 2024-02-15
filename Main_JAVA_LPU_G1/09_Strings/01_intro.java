class LPU{
    public static void main(String args[]){

        //Strings

        // String firstName = "Hello";
        // String lastName = "World";
        // String s1 = new String("Hello");

        // System.out.println(firstName + lastName);

        String s1 = "Hello World";
        String s2 = "Hey";
        String s3 = "hey";

        // System.out.println(s1.charAt(0));
        // System.out.println(s1.length());
        // System.out.println(s1.replace("o", "w"));

        System.out.println(s3 == s2);

    }
}


//In java, strings are an object that represents sequence of char values
//Strings in java are immutable (cannot be changed)
//Whenever we create  a string, the JVM checks the "String Constant pool" sirst. If the string already exists in the pool, a reference to the pooled instance is returned, if the string doesn't exist in the pool, a new string instance is creatd and placed in the pool.
//This makes JAVA memory efficient, because no new objects are created if it already exists in the SCP