public class Person{
    int age=21;
    String name="Akanksha";
    public void display(){
       // System.out.println("Age is:"+age);
        //System.out.println("NAme is:"+name);
        System.out.println("hii");
    }
    public static void main(String args[]){
        Student s=new Student();
        s.display();
    }
}
class Student extends Person{
    char Grade='A';
    public void display(){
        System.out.println("Age is:"+age);
        System.out.println("NAme is:"+name);
        System.out.println(" Grade is:"+Grade);
    }
}