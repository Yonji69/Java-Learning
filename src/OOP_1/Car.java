package OOP_1;
// this is on constructor overloading
public class Car {
    String name;
    String brand;
    int yom;

    Car()
    {
        this.name="toyoota";
        this.brand="hyundai";
        this.yom=2000;
    }
    Car(String name)
    {
        this.name="toyota";

    }

    Car(String name , String brand , int yom)
    {
        this.name=name;
        this.brand=brand;
        this.yom=yom;
    }

    Car( Car car2)
    {
        this.name= car2.name;
    }


    public static void main(String[] args)
    {
        //Car car = new Car("ford","tesla",2000);
        Car car = new Car();
        Car car2 = new Car(car);

        System.out.println(car.name);
        System.out.println(car2.name);
    }
}
