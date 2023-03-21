package javaoop.exercises._1;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /*
      1: Create a new Class in this package

         Call this class 'Course'

         Inside add the following variables, using an appropriate type.
         courseName, maxStudents, qualityRatingOutOf10

         On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        // ciclo per iterare e assegnare gli anni alla persona;
        for (int i = 0; i < studentNames.size(); i++) {
            String name = studentNames.get(i);
            Integer age = studentAges.get(i);
            Student student = createNewStudent(name, age);
            System.out.println(student.getName() + " " + student.getAge() + " anni.");
        }
    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();

        // metodo di creazione nuovo studente mediante i set;
        student.setName(name);
        student.setAge(age);
        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // copia dell'esercizio 2
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        Course course = new Course();

        for (int k = 0; k < studentNames.size(); k++) {
            String name = studentNames.get(k);
            int age = studentAges.get(k);
            Student student = createNewStudent(name, age);

            //esercizio 3
            course.students.add(student);
        }

        // stampa in colonna
        for (Student st1: course.students) {
            System.out.println(st1);
        }

        // loop per la media d'età degli studenti partendo dalla lista degli studenti;
        double sum = 0;
        for (int i = 0; i < studentAges.size(); i++) {
            sum += studentAges.get(i);
        }
        double media = sum/studentAges.size();
        System.out.println("La media d'età degli studenti è : " + media);
    }
}
