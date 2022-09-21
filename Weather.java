import java.util.Scanner;
public class Weather {
    public static void main(String args[])
    {
        String Mausam = "Sunny";
        if(Mausam == "Rainy")
        {
            System.out.println("Read a book!");
        }
        else if(Mausam == "Snowy")
        {
            System.out.println("Go for Iceskating");
        }
        else if(Mausam == "Sunny")
        {
            System.out.println("Go to play Basketball");
        }
        else
        {
            System.out.println("Go Study don't waste your time");
        }
    }
}