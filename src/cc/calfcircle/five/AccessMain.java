package cc.calfcircle.five;

public class AccessMain {
    public static void main(String[] args) {
        AcessIndientity ai = new AcessIndientity();
        ai.mProtectedV = 1;
        ai.mPublicV = 1;
//        ai.mPrivateV = 1;
        ai.publicMethod();
        ai.protectedMethod();
//        ai.privateMethod();
    }
}
