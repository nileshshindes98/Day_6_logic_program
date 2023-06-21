public class ReverseInt {
    public static void main(String[] args)
    {
        int m = 256, n, reversed = 0;

        for (; m != 0; m /=10) {
            n = m % 10;
            reversed = reversed * 10 + n;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
