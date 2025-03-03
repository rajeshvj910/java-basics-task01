import java.util.Scanner;
//Write a program to find the smallest number among three numbers
class Program05 {
    public static void main(String[] args) {

        int k = 5;

        for(int i = k; i >= 1; i--) {
            for(int j = k; j >= 1; j--) {

                int value = (i > j) ? i : j;
               System.out.print(value);
            }
            System.out.println();
        }
    }
}