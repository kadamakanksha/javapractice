//Write a Java program to create a method that takes an array of strings as input and returns the length of the longest string.
public class Longest

 {
    public static void main(String[] args) {
        String[] myStrings = {"Hello", "world", "foo", "bar", "bazqux"};
        int longestLength = getLongestStringLength(myStrings);
        System.out.println("The length of the longest string is: " + longestLength);
    }

    public static int getLongestStringLength(String[] arr) {
        int longestLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longestLength) {
                longestLength = arr[i].length();
            }
        }
        return longestLength;
    }
}
