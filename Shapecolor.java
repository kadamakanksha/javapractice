public class Shapecolor{
    String color="Black";
    public void getcolor(){
        System.out.println("color of shape :"+color);
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.getcolor();
        Rectangle r=new Rectangle();
        r.getcolor();
        Shapecolor s=new Shapecolor();
        s.getcolor();
    } 
}
class Circle extends Shapecolor{
    String color="Pink";
    public void getcolor(){
        System.out.println("color of shape :"+color);
    }
}
class Rectangle extends Shapecolor{
    String color ="Orange";
    public void getcolor(){
        System.out.println("color of shape :"+color);
    }
}