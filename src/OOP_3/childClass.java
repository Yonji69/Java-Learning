package OOP_3;

public class childClass extends baseClass {

    public void childMethod()
    {
        System.out.println("Child Method");
    }


    public static void main(String[] args) {
        childClass ob2 = new childClass();
        ob2.calculateArea(4,50);

        baseClass b1 = new childClass();
        b1.baseMethod();

        //childClass c1 = new baseClass(); // this line gives an error because the child class is not of type baseclass
        // the object must actually be of type child class in order to create an object that references a baseclass


        childClass ob1 = new childClass();
        ob1.childMethod();
        ob1.calculateArea(6,7); // the child class can access both its own methods as well as its base class methods as well






    }
}
