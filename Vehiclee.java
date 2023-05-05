public class Vehiclee{
    int speedd=80;
    int fuell=2;
    public void driver(){
        System.out.println("Speed of vehicle:"+speedd);
        System.out.println("Fuel in ltr:"+fuell);

    }
    public static void main(String args[]){
        Carr c=new Carr();
        c.driver();
        Truck t=new Truck();
        t.driver();
        Vehiclee v=new Vehiclee();
        v.driver();
    }
}
class Carr extends Vehiclee{
    int door=4;
    public void driver(){
        System.out.println("No of doors of car:"+door);
       

    }
}
class Truck extends Vehiclee{
    int cap=1000;
    public void driver(){
        System.out.println("Capacity of truk is:"+cap);
       

    }
}