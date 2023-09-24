package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        if (number >= 100 && number <= 999) { // Check if it's a 3-digit number
            int digit1 = number % 10;        // Extract the units digit
            int digit2 = (number / 10) % 10; // Extract the tens digit
            int digit3 = number / 100;       // Extract the hundreds digit

            // Revert the number by rearranging the digits
            int revertedNumber = digit1 * 100 + digit2 * 10 + digit3;
            
            // Print the reverted number
            System.out.println("Reverted number: " + revertedNumber);
        } else {
            System.out.println("Input is not a 3-digit number");
        }
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        int numberToRevert = 489;
        reverter.revert(numberToRevert); // Should print "Reverted number: 984"
    }
}
