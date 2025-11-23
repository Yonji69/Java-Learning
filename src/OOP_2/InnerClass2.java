package OOP_2;

public class InnerClass2 {

     class student {
        String name;


        public static void main(String[] args)
        {
//            student s = new student();
//            s.name="Mohan";
//            System.out.println(s.name);
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Inner class ");
//       student s = new student();
//        s.name="Mohak";
//        System.out.println(s.name);

        InnerClass.student is = new InnerClass.student();
        is.name = "yabba";
        System.out.println(is.name); // this works because student is a static class and its reference object is created in a static scope of the main
        // in order to execute the student class we have to declare an object of both the Inner and student class at the same time
    }
}
