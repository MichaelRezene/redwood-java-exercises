package grades;

import grades.Student;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Micky");
        Student student2 = new Student("Geni");
        Student student3 = new Student("Mercy");
        Student student4 = new Student("Grmeso");

        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(87);

        student2.addGrade(90);
        student2.addGrade(70);
        student2.addGrade(60);

        student3.addGrade(99);
        student3.addGrade(76);
        student3.addGrade(92);

        student4.addGrade(90);
        student4.addGrade(60);
        student4.addGrade(56);

        students.put("Mike", student1);
        students.put("Genesis", student2);
        students.put("Mehert", student3);
        students.put("Grmay", student4);

        do {
            System.out.println("Here are the github usernames of our students:\n");

            for (String username : students.keySet()) {
                System.out.print(" | " + username + " | ");
            }
            System.out.println();
            System.out.println();
            String userInput = input.getString("What student would you like to see more information on?");

            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput).getName() + "\nGithub Username: "
                        + userInput + "\n"
                        + "Current Average: "
                        + students.get(userInput).getGradeAverage());
            } else {
                System.out.println(" Sorry, no student found with the github username");
            }
            System.out.println();

        }while(input.yesNo("Would you like to see another student? (y/n)"));

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
