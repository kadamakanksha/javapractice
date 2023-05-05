public class Person1{
    int page=21;
    String pname="Akanksha";
    public void display11(){
       System.out.println("Age is:"+page);
        System.out.println("NAme is:"+pname);
        System.out.println("hii");
    }
    public static void main(String args[]){
        Student1 s=new Student1();
        s.display11();
        Person1 p=new Person1();
        p.display11();
        Teacher t = new Teacher();
        t.display11();
        
    }
}
class Student1 extends Person1{
    char Grade1='A';
    public void display11(){
    
        System.out.println(" Grade is:"+Grade1);
    }
}
class Teacher extends Person1{
    String sub="Java";
    public void display11(){
        
        System.out.println(" subject  is:"+sub);
    }
    }
