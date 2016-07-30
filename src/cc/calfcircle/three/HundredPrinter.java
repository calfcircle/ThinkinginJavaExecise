package cc.calfcircle.three;

public class HundredPrinter {
    public static void main(String[] args) {
        HundredPrinter printer = new HundredPrinter();
        printer.printHundred();
        printer.breakPrintHundred();
    }

    public void printHundred() {
        for (int i = 1; i <= 100; i ++) {
            System.out.println(i);
        }
    }

    public void breakPrintHundred() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            if (i  == 47) {
                break;
            }
            i ++;
        }
    }
}
