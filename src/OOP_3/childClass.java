package OOP_3;

public class childClass extends baseClass {

    public void childMethod()
    {
        System.out.println("Child Method");
    }

    @Override
    void overrideMethod2()
    {
        System.out.println("this is getting displayed from the child class overriden from the parent class");
    }
    // we cannot override static methods in the child classes
//    static void overrideMethod()
//    {
//        System.out.println("this is a static method from the child class");
//    }


    public static void main(String[] args) {
//        childClass ob2 = new childClass();
//        ob2.calculateArea(4,50);
//
//        baseClass b1 = new childClass();
//        b1.baseMethod();
//
//        //childClass c1 = new baseClass(); // this line gives an error because the child class is not of type baseclass
//        // the object must actually be of type child class in order to create an object that references a baseclass
//
//
//        childClass ob1 = new childClass();
//        ob1.childMethod();
//        ob1.calculateArea(6,7); // the child class can access both its own methods as well as its base class methods as well
        childClass ob2 = new childClass();
        ob2.overrideMethod();
        /* Note: if we have to override a static method from the base class we will have to create the same methof in the child class
        itself , so lik in the lines 15-19 when we annotate the function with override it wont work but if we remove it
        it becomes a fucntion defined int he child class itself regardless if it has the same name as the base class or a new name
         */
        ob2.overrideMethod2();



    }
}
