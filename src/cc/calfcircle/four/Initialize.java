package cc.calfcircle.four;

public class Initialize {
    public static void main(String[] args) {
        Initialize ini = new Initialize();
        ini.defaultInitialize();
    }

    private int mNum;
    private char mChar;
    private String mName;

    static {
        int mSNum = 1;
        System.out.println("Static block initialize");
    }

    {
        int mSFNum = 2;
        System.out.println("Block initialize");
    }

    public Initialize() {
        System.out.println("Constructor initialize");
    }

    private void defaultInitialize() {
        System.out.println(mNum);
        System.out.println(mChar);
        System.out.println(mName);
    }
}
