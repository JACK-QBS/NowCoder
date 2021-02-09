public class Test {
    public static void main(String[] args) {
        /*int i = 7;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);*/

        int r = 0;
        int i = 2;
        switch (i) {
            case 1:
                r = r + i;
            case 2:
                r = r + i * 2;
            case 3:
                r = r + i * 3;
        }
        System.out.println(r);
    }
}
