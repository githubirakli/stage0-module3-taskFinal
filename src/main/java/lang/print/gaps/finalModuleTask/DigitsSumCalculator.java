package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        if(number>=1000&&number<=9999){
            int digit1=number%10;
             int  digit2=(number%100-digit1)/10;
              int digit3=(number%1000-number%100)/100;
               int digit4=(number/1000);
               System.out.println(digit1+digit2+digit3+digit4);
        }else{
            System.out.println("Input is not a four-digit number");
        }
        }
        public static void main(String[] args) {
            DigitsSumCalculator sumOfDigits= new DigitsSumCalculator();
            int number= 8888;
            sumOfDigits.calculateSum(number);
    }
}
