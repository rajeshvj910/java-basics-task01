import java.util.Scanner;
//Write a program to find the smallest number among three numbers
class Program04 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int firstNo = obj.nextInt();

        int secondNo = obj.nextInt();

        int thirdNo = obj.nextInt();

        int smallest = firstNo;

        if(smallest >= secondNo) {
            smallest = secondNo;
        } 
        if(smallest >= thirdNo) {
            smallest = thirdNo;
        }

        System.out.println("Given Smallest Number is : "+smallest);

    }
}