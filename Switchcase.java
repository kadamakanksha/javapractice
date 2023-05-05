import java.util.Scanner;

public class Switchcase{
    public static void main(String args[]){
        //Write a Java program to create a switch statement that takes a variable of type int and prints "One" if the value is 1, "Two" if the value is 2, and "Other" for any other value.
        System.out.println("Enter between  1 to 5:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("One");
            break;
             case 2:
            System.out.println("Two");
            break;
            case 3:
            System.out.println("THREE");
            break;
            
            case 4:
            System.out.println("FOUR");
            break;
            case 5:
            System.out.println("FIVE");
            break;
            
            
            
        }
    }
}