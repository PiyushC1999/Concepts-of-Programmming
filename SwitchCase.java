import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[])
    { Scanner Temp = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int Temperature = Temp.nextInt();
        switch (Temperature)
            {
                case 30:
                    System.out.println("We're in normal condition");
                    break;
                    case 40:
                    System.out.println("We're in a hot environment");
                    break;
                    case -10:
                    System.out.println("We're in a cold environment");
                    break;
                    case -35:
                    System.out.println("we're in a supercold environment");
                    break;
                    default:
                    System.out.println("wrong input");

            }
        }
    }
