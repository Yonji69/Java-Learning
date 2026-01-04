package OOPS_5;

public class InterfaceImpl implements InterfaceClass{

    private String name;
//
//
//    InterfaceImpl(String name)
//    {
//        this.name=name;
//    }

    // we can overide the methods of the interface just like we have it in abstract classes as well
    @Override
    public String setName(String name) {
        this.name=name+ " assigned from the setter";
        return name ;
    }


    String getName(){

        System.out.println(name+" is displayed from the getter");
        return name;
    }

    void display()
    {
        System.out.println(name);
    }

    public static void main(String[] args) {
        InterfaceImpl imp = new InterfaceImpl();
        imp.setName("Juan Chipotle");
        imp.display();
        imp.getName();



    }


}
