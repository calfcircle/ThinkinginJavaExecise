package cc.calfcircle.four;

public class GC {
    public static void main(String[] args) {
        new Sample();
        //If not call gc, the sample object may not be cleared.
        System.gc();
    }

    public static class Sample{
        public void finalize(){
            System.out.println("finalize here");
        }
    }
}
