public class HelloWorld {
    // psvm enter could direct you
    public static void main(String[] args){

        //sout will direct you
        // general syntax: type identifier;
        // 3 types of integer:
        short shortNumber = 0;
        long longNumber = 0;
        int  intNumber = 0;

        float floatNumber = 2.0f; // if you forget the f the code doesn't compile
        double doubleNumber = 10.5;
        //
        char singleCharacter = 'l'; // always single quotes
        //
        boolean booleanValue = true;
        //
        String name = ("Redwood");  //always double quotes

        // const MY_CONSTANT = 4;
        final int MY_CONSTANT = 4;

        System.out.println(3 + 4);
        System.out.println(3 - 4);
        System.out.println(3 / 4);
        System.out.println(3 * 4);

        float division = 3.0f / 4;
        System.out.println(division);

        System.out.println(3 % 4);

        int x = 5;
        System.out.println(x++); // 5
        System.out.println(++x); // 7
        System.out.println(x--); // 7
        System.out.println(--x); // 5


        x += 3; // 8
        System.out.println(x);
        x %= 2; //
        System.out.println(x);

        // It is only valid if the value on the right is smaller
        //than the type in the left
        double aDoubleNumber = 10; // from int to double
        System.out.println(aDoubleNumber);

        System.out.println("Hello World!");
        System.out.println("Hello Redwood!");

    }
}
