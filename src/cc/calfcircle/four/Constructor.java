package cc.calfcircle.four;

public class Constructor {
    public static void main(String[] args) {
        Constructor con1 = new Constructor();
        Constructor con2 = new Constructor("Aha, there is a message");

        Constructor[] array1 = new Constructor[]{};
        Constructor[] array2 = new Constructor[] {
          new Constructor(),
          new Constructor("array, this is a message"),
        };

        String[] array3 = new String[] {
                "array string 1",
                "array string 2",
                "array string 3",
                "array string 4",
        };

        for (String str : array3) {
            System.out.println(str);
        }
    }

    public Constructor() {
        System.out.println("This is the default constructor");
    }

    public Constructor(String message) {
        System.out.println("Constructor " + message);
    }
}
