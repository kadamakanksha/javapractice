public class Vehicle{
int fuel=5;
int speed=40;
public void drive(){
    System.out.println("Fuel is"+fuel);
    System.out.println("Speed is"+speed);
}



    public static void main(String args[]) {
        Car c=new Car();
        c.drive();
    }
}
class Car extends Vehicle{
    int seat=4;
    public void drive(){
        System.out.println("Fuel is: "+fuel);
        System.out.println("Speed is: "+speed);
        System.out.println("Seat :"+seat);
    }
}