package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */


    private static void exercise1() {
        System.out.println("Exercise 1:");

        // ho creato una nuova classe Student con 5 field messa nello steso package;
        Student3 student = new Student3();
        student.setName("Davide");
        student.setSurname("Noto");
        student.setAge(26);
        student.setCourse("Java12");
        student.setFavoriteCourse("JSPinJEE");
        System.out.println(student.toString());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        // test del contatore;
        Student3 student = new Student3();
        student.getName();
        student.getName();
        student.getName();
        System.out.println("Il metodo getName() è stato chiamato " +
                            student.getNameCount() + " volte");

        // ho usato throw new IllegalArgumentException("...");
        // test delle eccezioni;
        Student3 student1 = new Student3();
        student.setAge(-1);
        student1.setSurname(null);
        student1.setFavoriteCourse(" ");
        student1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); //41 caratteri

    }

}

