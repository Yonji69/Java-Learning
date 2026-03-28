package OOPS_6;

class Test<T> {

    T obj;

    Test(T obj) {
        this.obj=obj;
    }

    public T getObject() {

        return this.obj;
    }

    public void display() {
        System.out.println(this.obj + " type of the generic is " + this.obj.getClass());

    }
}
public class Generics {

    public static void main(String[] args){
        Test<String> nameTest = new Test<String>("Name");
        nameTest.getObject();
        nameTest.display();

        Test<Integer> numTest = new Test<Integer>(12);
        numTest.getObject();
        numTest.display();
    }
}
