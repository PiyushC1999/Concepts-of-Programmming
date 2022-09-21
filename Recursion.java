public class Recursion {

    public static void main(String[] args) {
        int number=10;
        int sum= recursion(number);
        System.out.println("sum = " +sum);
    }
    public static int recursion (int num) {
        if (num!=0)
            return num +recursion(num-1);
        else
            return num
                    ;
    }
}