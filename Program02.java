import java.util.Scanner;
// Write a Program to check whether the given input number is positive or negative.

public class Program02 {
    
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        String userInput = obj.next();

        int inputNumber = Integer.parseInt(userInput);

        if(inputNumber == 0) {
                System.out.println("Zero is Neutral");
                return;
        }
        

        String resultText = (inputNumber > 0) ? "Positive Number" : "Negative Number";
        
        System.out.println("The Input (" + userInput + ") Provided is: "+ resultText);
    }

}