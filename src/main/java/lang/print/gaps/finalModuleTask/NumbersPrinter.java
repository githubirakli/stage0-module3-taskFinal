package lang.print.gaps.finalModuleTask;
public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean result=(number>0);
            System.out.println(result);
 }
    public static void main(String[] args){
        NumbersPrinter printer= new NumbersPrinter();
        int number=10;
        printer.printIsPositive(number);
}
}
