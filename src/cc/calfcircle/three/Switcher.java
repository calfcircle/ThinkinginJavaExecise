package cc.calfcircle.three;

public class Switcher {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchEveryCase();
        switcher.switchWithoutBreak();
    }


    public void switchEveryCase() {
        for (int i = 0; i < 5; i ++) {
            switch (i) {
                case 0:
                    System.out.println("switch case 0");
                    break;
                case 1:
                    System.out.println("switch case 1");
                    break;
                case 2:
                    System.out.println("switch case 2");
                    break;
                case 3:
                    System.out.println("switch case 3");
                    break;
                case 4:
                    System.out.println("switch case 4");
                    break;
                default:
                    System.out.println("can not process this case " + i);
                    break;
            }
        }
    }

    public void switchWithoutBreak() {
        for (int i = 0; i < 5; i ++) {
            switch (i) {
                case 0:
                    System.out.println("switch case 0");
                case 1:
                    System.out.println("switch case 1");
                case 2:
                    System.out.println("switch case 2");
                case 3:
                    System.out.println("switch case 3");
                case 4:
                    System.out.println("switch case 4");
                default:
                    System.out.println("can not process this case " + i);
            }
        }
    }
}
