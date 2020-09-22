public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int oddSum = n2;

        while (n3 < 10000) {
            n3 = n1 + n2;
            if (n3 % 2 != 0) {
                oddSum += n3;
            }
            n1 = n2;
            n2 = n3;
        }

        System.out.println(oddSum);
    }
}
