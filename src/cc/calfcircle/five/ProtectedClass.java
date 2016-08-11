package cc.calfcircle.five;

public class ProtectedClass {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.mData = 0;
    }
}

class SecondClass {
    protected int mData;
}
