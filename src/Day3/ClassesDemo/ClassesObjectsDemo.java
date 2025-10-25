package Day3.ClassesDemo;

public class ClassesObjectsDemo
{
    public static void main(String[] args) {
        Car car1=new Car();
        car1.speed=100;
        car1.brand="toyota";
        car1.color="red";
        car1.drive();

        Car car2=new Car();
        car2.speed=120;
        car2.brand="kia";
        car2.color="white";
        car2.drive();
    }
}
