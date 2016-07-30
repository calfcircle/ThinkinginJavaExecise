package cc.calfcircle.three;

public class Precedence {
    public static void main(String[] args) {
        Precedence prd = new Precedence();
        System.out.println(prd.calc1(2,3,4));
        System.out.println(prd.calc2(2,3,4));
    }

    public int calc1(int x, int y, int z) {
        return x + y - 2/2 + z;
    }

    public int calc2(int x, int y, int z) {
        return x + (y - 2)/(2 + z);
    }
}
