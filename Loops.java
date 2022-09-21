public class Loops {
    public static void main(String args[]) {

        for (int k = 1; k <= 100; k++) {
            int flag = 0;
            for (int i = 2; i <= k / 2; i++) {
                if (k % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(k + " is a prime number.");
            }
        }
    }
}
