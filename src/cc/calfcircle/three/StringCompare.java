package cc.calfcircle.three;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        stringCompare.compareString("123","123");
        stringCompare.compareString("123","456");
        stringCompare.compareString("hello","Hello");
    }

    public void compareString(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + " result " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + " result " + (str1 != str2));
        System.out.println(str1 + " equal " + str2 + " result " + str1.equals(str2));
    }
}
