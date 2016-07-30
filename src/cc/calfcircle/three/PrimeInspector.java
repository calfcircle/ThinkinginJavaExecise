package cc.calfcircle.three;

public class PrimeInspector {
    public static void main(String[] args) {
        PrimeInspector inspector = new PrimeInspector();
        for (int i = 1; i < 100; i ++) {
            if (inspector.inspect(i)) {
                System.out.println(i + " is a prime");
            }
        }
    }

    public boolean inspect(int i) {
            if (i == 2) {
                return true;
            } else if (i == 1) {
                return false;
            } else if (i % 2 != 0) {
                for (int j = 3; j*j <= i; j+=2) {
                    if (i % j ==0) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
    }
}
