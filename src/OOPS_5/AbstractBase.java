package OOPS_5;


/*
If any onf the classes or methods are declared abstract the methods implementing it must be abstract as well
*/
public abstract class AbstractBase {

    abstract void career();
    // abstract class cannot have a body
    // they define the struture for the other class to implement thier function

    abstract void degree();

    static void hello()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args)
    {
        AbstractBase ab = new AbstractBase() {
            @Override
            void career() {
                System.out.println("Base class chooses career");

            }

            @Override
            void degree() {
                System.out.println("base class chooses degree");
            }
        };
        System.out.println("Abstract class");
    }
}
