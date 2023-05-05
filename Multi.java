

 class Developer{

    int id1=101;
    String name1="abc";
    public void dev(){
        System.out.println("Developing app:");
    }
}
class Tester extends Developer{
    int id2=201;
    String name2="xyz";
    public void test(){
        System.out.println("Testing app:");
    }

}
 class Enduser extends Tester{
    int id3=301;
    String name3="pqr";
    public void user(){
        System.out.println("Deploying app:");
    }

}
public class Multi {
    public static void main(String args[]){
        Enduser e=new Enduser();
        e.dev();
        e.test();
        e.user();
        System.out.println(e.id1);
        System.out.println(e.name1);
        System.out.println(e.id2);
        System.out.println(e.name2);
        System.out.println(e.id3);
        System.out.println(e.name3);
    }
}
