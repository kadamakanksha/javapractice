import java.util.Scanner;

public class If{
    public static void main(String []args){
        //Write a Java program to create an if statement that checks if a variable of type int is greater than 5, and if it is, prints "Greater than 5" to the console
        System.out.println("Enter a number:");
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    if(a>5){
        System.out.println("Greater than five:"+a);
    }
    else{
        System.out.println("less than five:"+a);
    }
    
    
    }
}