import java.util.Scanner;
public class CdacPassing
{
            public static void main(String args[])
            {
                Scanner CdacMarks = new Scanner(System.in);
                System.out.println("Enter your CDAC marks:");
                Float marks = CdacMarks.nextFloat();
                if(marks>100)
                {
                    System.out.println("Incorrect Input");
                }
                else if (marks>=80)
                {
                    System.out.println("Woah,Congratulations you are Superhuman!");
                }
                else if (marks>=60)
                {
                    System.out.println("Distinction");
                }
                else if (marks>=40)
                {
                    System.out.println("First class");
                }
                else {
                    System.out.println("Failed, please reappear for the Exam!");
                }
            }
        }






