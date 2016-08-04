package cc.calfcircle.four;

public class UseThis {
    public static void main(String[] args) {
        UseThis ut = new UseThis();
        ut.firstMethod();
    }

    private void firstMethod(){
        System.out.println("First Method");
        secondMethod();
        this.secondMethod();
    }

    private void secondMethod() {
        System.out.println("Second Method");
    }
}
