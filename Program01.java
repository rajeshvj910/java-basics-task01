
// Write a program to print the numbers from 10 to 50 using for loop / while loop.
public class Program01 {
    
    public static void main(String[] args) {
       int start = 10;
       int end = 50;

       // Using For Loop
       for(int currentValue = start; currentValue <= end; currentValue++) {
        System.out.println(currentValue);
       }

       //Using for While Loop
       int startValue = start;
       while (startValue <= end) {
        System.out.println(startValue);
        startValue++;
       }
    }

}