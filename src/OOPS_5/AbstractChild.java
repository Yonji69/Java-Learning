package OOPS_5;

public class AbstractChild extends AbstractBase{



    // every single method from the base class has to be implemented.
    @Override
    void career() {
        System.out.println("You can choose your own career");

    }

    @Override
    void degree() {
        System.out.println("You can choose your own degree");

    }






    public static void main(String[] args) {
        //AbstractBase ab1 = new AbstractBase(); // we will have to reimplement the methods in the main class if we trying to instantiate an object of that class
        // and we cannot use the object from the base class and use it in teh child class like this
        //ab.career();

        AbstractChild ac = new AbstractChild();
        ac.career();
        ac.degree();


        AbstractBase.hello(); // static methods can be used inside the abstract classes
    }

    /* if a class has 1 or more than 1 abstract methods then it needs to have the abstract class

    we cannot creat objects of abstract classes and we cannot have abstract constructors

    we also cannot cretae abstract static methods
    but we can create static methods in abstract classes
     */
}
