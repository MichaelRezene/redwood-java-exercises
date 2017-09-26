public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("Zach", "Gulde");
        // Default constructor
        System.out.println(Person.population);
        Person ryan = new Person("Ryan", "Orsinger");
        // Default constructor
        System.out.println(Person.population);

        System.out.println(person.fullName());
        //        Person person = new Person("Zach", "Gulde"); // Default constructor
        //        System.out.println(Person.population);
        //        Person ryan = new Person("Ryan", "Orsinger"); // Default constructor
        //        System.out.println(Person.population);
        //
        //        System.out.println(person.fullName());


        // I don't need to create an instance of Arithmetic
    }
}