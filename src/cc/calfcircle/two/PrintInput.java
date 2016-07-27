//:PrintInput.java
package cc.calfcircle.two;

/**
 * Print input parameters of method in the class.
 * @author Calf
 * @version 1.0
 */
public class PrintInput {
    public static void main(String[] args) {
        PrintInput pi = new PrintInput();
        pi.print("Jack", 12, 160);
    }

    /**
     * Accept three parameters and pint all of them.
     * @param name Name to print
     * @param age Age to print
     * @param height Height to print
     */
    private void print(String name, int age, int height) {
        System.out.println("This is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("And I'm  " + height + "cm height");
    }
} ///:~
