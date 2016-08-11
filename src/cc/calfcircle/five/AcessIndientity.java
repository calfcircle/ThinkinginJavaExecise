package cc.calfcircle.five;

public class AcessIndientity {
    public int mPublicV;
    protected int mProtectedV;
    private int mPrivateV;

    public void publicMethod() {
        System.out.println("public method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }
}
