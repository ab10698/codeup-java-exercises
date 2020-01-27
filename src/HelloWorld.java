public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte num1 = 127;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;

        float num5 = 3.333f;
        double num6 = num5;
        System.out.println(num4);
        final double PI = 3.141592;
//        pi = 7;

        int bigNum1 = 200;
        byte bigNum2 = (byte) bigNum1;

        boolean yesNo = true;
        yesNo = false;

        char initial;
        initial = 'D';


        String name = "Alex";
        name.length();

        int myFavoriteNumber = 303;
        System.out.println(myFavoriteNumber);

        String myString = "Alex";
        System.out.println(myString);

//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);



    }
}
