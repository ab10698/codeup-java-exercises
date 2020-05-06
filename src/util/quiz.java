package util;

public class quiz {
    public static void main(String[] args) {

        System.out.println(compare(6, 2));
    }


    public static String compare(int x, int y) {
        if (x == y) {
            return x + "=" + y;
        } else if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return null;
        }
    }
}