class Shape{
    int width=10;
    int height=20;
    public  void area()
    {
        System.out.println("hii");
    }
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        System.out.println(r.area());
        Triangle t=new Triangle();
        System.out.println(t.area());
    
        Shape s=new Shape();
        s.area();
    }
}
class Rectangle extends Shape{
    public static int area(){
        int n=width*height;
        return n;
    }
}
class Triangle extends Shape{
    public static float area(){
        float n1=1/2*width*height;
        return n1;
    }
}
i love you like a child looking at the stars without being able to touch them