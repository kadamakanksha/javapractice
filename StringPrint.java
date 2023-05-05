import java.util.Scanner;

public class StringPrint{
    public static void main(String args[]){
        String str="Hello World!!";
        System.out.println("Printing string :"+str);
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing string from user");
        String sr=sc.nextLine();
        System.out.println(" here :"+sr);
    }
}