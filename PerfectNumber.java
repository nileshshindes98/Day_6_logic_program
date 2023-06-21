public class PerfectNumber {

    public static void main(String[] args) {

        int num = 28;
        int d = 0;
        String divisorString = "";
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                d += i;
                divisorString += i + "+";

            }
        }

        if (d == num) {
            divisorString = divisorString.substring(0, divisorString.length() - 1); // Remove the last "+"
            System.out.println("NUMBER IS PERFECT NUMBER" +
                    "\n" + num + " = " + d);
            System.out.println(divisorString + "=" + num);

        } else {
            System.out.println("number is not perfect number");
        }
    }

}
