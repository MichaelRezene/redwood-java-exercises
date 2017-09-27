public class MethodLecture {
    public static void main(String[] args) {
        sayHello("Micky",30);
        sayHello();

//        for (int i = 0;  i < 10; i++){
//            System.out.println("i = " + i);

        counter(0);
        }
    public static int counter(int i){
        System.out.println("i = " + i);
        i++;
        if (i == 9){
            return i;
        }
        return counter(i);

    }
                // ==========////==========

    public static void sayHello(String name,int age) {
        System.out.println("Hello " + name + "age " + age);
        System.out.println(add(5,6));
    }
    public static int add(int x, int y){
        return x + y;
    }

    // same method  different argument
    // sayHello(String name,int age) & sayHello()

    public static  void sayHello(){
        System.out.println("Hi there,");

    }

}
