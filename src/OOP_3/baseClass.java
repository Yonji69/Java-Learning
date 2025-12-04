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


    public static void main(String[] args) {
        baseClass shape = new baseClass();
        shape.calculateArea(5,6);
    }
}
