import java.util.Scanner;
//Write a program to get and read the input then write an output using Scanner Api.
class Program06 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int firstInp = obj.nextInt();

        String secondInp = obj.next();

        double thirdNo = obj.nextDouble();

        System.out.println("Given Integer input is : "+firstInp);

        System.out.println("Given String input is : "+secondInp);

        System.out.println("Given Double input is : "+thirdNo);
    }
}