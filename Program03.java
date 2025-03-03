import java.util.Scanner;
// Write a Program to reverse the given input number using loops

public class Program03 {
    
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        String userInput = obj.next();

        int inputNumber = Integer.parseInt(userInput);
        if(inputNumber == 0) {
                System.out.println("Zero is Invalid");
                return;
        }

        int reversed = 0;
    
       // using while loop
        while(inputNumber != 0) {
            int digit = inputNumber % 10;
            reversed = reversed * 10 + digit;
            inputNumber /= 10;
           
        }
         System.out.println(reversed);

        // using for loop
         for(;inputNumber != 0; inputNumber/=10) {
             int digit = inputNumber % 10;
            reversed = reversed * 10 + digit;
         }
          System.out.println(reversed);
    }

}