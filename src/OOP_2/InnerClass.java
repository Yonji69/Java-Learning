package OOP_2;

public class InnerClass {

    static class student { // if if declare this as static this class does not depend on its outerclass since it doesnt need an object
        String name;

//        public static void main(String[] args)
//        {
//            student stud = new student();
//            stud.name="Jiji";
//            System.out.println(stud.name);
//        }
    }

//    static class teacher{
//        String tName;
//
//        void display()
//        {
//            System.out.println("inside the teacher class");
//        }
//
//        public static void main(String[] args)
//        {
//            teacher t = new teacher(); // we cannot use a non static or create an object in a static scope
//            t.tName="lol";
//            System.out.println(t.tName);
//            t.display();
//        }
//    }  // this teacher class is non static so its dependent on its outerclass for its exectuion


    public static void main(String[] args) {
        student ob = new student();
        ob.name = "Juju";
        System.out.println(ob.name);


        // teacher t = new teacher();
        // InnerClass.teacher = new InnerClass.teacher(); // this is not possible as it gives an error saying that this is static reference and u cannot do it


    }
}
