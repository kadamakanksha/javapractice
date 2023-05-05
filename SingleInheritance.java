class SingleInheritance{
    String Name="Hiii!!";
    public static  intro(){
        System.out.println("Here is parent class.....");

        public static void main(String args[])
        {
            Child c=new Child();
            c.intro();
            c.methodd();
            System.out.println(c.name1);
            System.out.println(c.Name);
        }
    }
}
class Child extends SingleInheritance{
    String name1="Heyy!!";
    public static int  methodd(){
        System.out.println("Here is child class...");
    }
}