package codewars;

public class MainArgs {
    public static void main(String... args) {
        //System.out.println(args[args.length - 1]);

        int[] arr = new int[]{1,2,3};

        int sumCalculated = sumOfNumbers(1,2,3,4);
        System.out.println(sumCalculated);

    }

    public static int sumOfNumbers(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
