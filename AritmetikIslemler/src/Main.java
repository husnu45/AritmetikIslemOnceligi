import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Enter the First Number : ");

        int firstNumber = getNumber.nextInt();

        System.out.print("Enter the Second Number : ");

        int secondNumber = getNumber.nextInt();

        System.out.print("Enter the Third Number : ");

        int thirdNumber = getNumber.nextInt();

        int action = firstNumber + ((secondNumber * thirdNumber) - secondNumber);

        System.out.println(action);


    }

}
