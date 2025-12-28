package OOP_3;

public class baseClass {

    int len;
    int breadth;

    public double calculateArea(int len , int breadth)
    {
        double res=len* breadth;
        System.out.println("Result is "+res);
        return res;
    }

    public void baseMethod()
    {
        System.out.println("Base Method");
    }
    // static override methods cannot be overwritten
    static void overrideMethod()
    {
        System.out.println("this is a static method from the base class");
    }

    void overrideMethod2()
    {
        System.out.println("this is getting displayed from the parent  class");
    }
    public static void main(String[] args) {
        baseClass shape = new baseClass();
        shape.calculateArea(5,6);
    }
}
