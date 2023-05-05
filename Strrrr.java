//Write a Java program to create a method that takes a string as input and returns the length of the string.
public class Strrrr{



    
        public static void main(String[] args) {
            String myString = "Hello, world!";
            int length = getStringLength(myString);
            System.out.println("The length of the string is: " + length);
        }
    
        public static int getStringLength(String str) {
            return str.length();
        }
  
    
}