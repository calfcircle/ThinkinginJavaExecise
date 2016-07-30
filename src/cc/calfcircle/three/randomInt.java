package cc.calfcircle.three;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        RandomInt rd = new RandomInt();
        rd.random();
    }

    public void random () {
        Random random = new Random();
        int [] values = new int[25];

        for (int i = 0; i < values.length; i ++) {
            values[i] = random.nextInt(100);
        }

        for (int j = 0; j < values.length & (j+1) < values.length; j ++) {
            if (values[j] < values[j+1]) {
                System.out.println(values[j] + " lesser than " + values[j+1]);
            } else if(values[j] == values[j+1]) {
                System.out.println(values[j] + " equal " + values[j+1]);
            } else {
                System.out.println(values[j] + " greater than " + values[j+1]);
            }
        }
    }
}
