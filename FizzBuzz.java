import java.util.Scanner;
public class FizzBuzz {
    public static void main(String args[]) {
        Scanner Fizz = new Scanner(System.in);
        System.out.println("Enter your No:");
        Float Num = Fizz.nextFloat();

        if (Num % 3 == 0 && Num % 5 == 0)
        {
            System.out.println("fizz buzz");
        }
        else if (Num % 3 == 0)
        {
            System.out.println("fizz");
        }
        else if (Num % 5 == 0)
        {
            System.out.println("buzz");
        }
        else
        {
            System.out.println("no fizz and no buzz");

        }
    }
}