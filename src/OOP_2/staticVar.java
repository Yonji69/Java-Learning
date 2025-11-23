package OOP_2;

public class staticVar {
    static int a = 7;
    static int b;

    static {
        System.out.println("Inside the static block");
        b=a*2;
        System.out.println(b);

    }
    int add(int a, int b)
    {

        int res=a+b;
        return a+b;

    }
    public static void main(String[] args)
    {
        System.out.println("static var");
        staticVar sv = new staticVar();
        int res = sv.add(staticVar.a,b);
        System.out.println(res);
        System.out.println(a);

    }
}
