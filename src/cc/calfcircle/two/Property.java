//: Property.java
package cc.calfcircle.two;


import java.util.Date;
import java.util.Properties;

/**
 * The first Thinking in java program.
 * Lists system information on current machine
 * @author Calf
 * @version 1.0
 */

public class Property {
    /**
     * Sole entry point to class & application
     * @param args array of string arguments
     * @return No return value
     * @exception Exception No exceptions thrown
     */
    public static void main (String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();

        p.list(System.out);
        System.out.println("--- Memory Usage: ");

        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "
                            + rt.totalMemory()
                            + " Free Memory = "
                            + rt.freeMemory());
    }
} ///:~
