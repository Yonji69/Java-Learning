package OOP_1;

class Box {
    int value;

    Box(int v) {
        value = v;
    }
}

public class PassByValueExample {

    static void changeNumber(int num) {
        num = 10;
        System.out.println("Inside changeNumber: num = " + num);
    }

    static void changeBox(Box b) {
        b.value = 99;
        System.out.println("Inside changeBox: b.value = " + b.value);
    }

    static void newBox(Box b) {
        b = new Box(500);
        System.out.println("Inside newBox: b.value = " + b.value);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before changeNumber: x = " + x);
        changeNumber(x);
        System.out.println("After changeNumber:  x = " + x);
        System.out.println();

        Box myBox = new Box(20);
        System.out.println("Before changeBox: myBox.value = " + myBox.value);
        changeBox(myBox);
        System.out.println("After changeBox:  myBox.value = " + myBox.value);
        System.out.println();

        System.out.println("Before newBox: myBox.value = " + myBox.value);
        newBox(myBox);
        System.out.println("After newBox:  myBox.value = " + myBox.value);
    }
}
