

public class Person {
    // class or static variables
             public static int population = 0; // shared

            // instance or object variables
             private String firstName;
     private String lastName;

             public  Person (
         String aFirstName, String aLastName  // constructor parameters
    ) {
                 population++;
                 firstName = aFirstName; // local variable
                 lastName = aLastName;
                // private String name;

                 //  public Person(String name) {
                   //  this.name = name;
                 }

    public String getName() {
        return "";
    }

    public void setName(String name) {
        name = name;
    }

    public void sayHello() {
        System.out.println("Hello, "  + ", nice to see you!");
    }
}

//            public String fullName() {
//                    return firstName + " " + lastName;
//                public static void main(String[] args) {
//        //        Person person = new Person("Zach");
//        //        person.setName("Alex");
//        //        person.sayHello();
//        //        System.out.println(person.getName());
//
//        Person person1 = new Person("John");
//                        Person person2 = person1;
//
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//        person2.setName("Jane");
//
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//            }
//        }