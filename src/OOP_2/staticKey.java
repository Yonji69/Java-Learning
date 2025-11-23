package OOP_2;

public class staticKey {



    public static void main(String[] args)
    {
        staticKey sk = new staticKey();
        //sk.greet();
        System.out.println("Hello");
        //greet(); // i cannot run this funtion without it giving me an error stating that non static members cannot be use as static ones
        message(); // this will work because this is static and static members can run without an object
    }

    static void message()
    {
        System.out.println("Hello Good day to you");
        //sk.greet(); // we cannot have non static functions in a static functions , in order to run this we need to create an object for the same
        staticKey sk2 = new staticKey();
        sk2.greet();
    }
    void greet() // this is non static so if we have to perfomr this operation this needs an object
    {
        System.out.println("Greetings");
        //staticKey.message(); // static functions can also be written in non statc functions as well
    }
}
