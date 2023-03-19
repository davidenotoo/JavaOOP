package javaoop.exercises._3;

import java.util.Objects;

public class Student3 {

    private String name;
    private String surname;
    private int age;
    private String course;
    private String favoriteCourse;
    private int nameCount;

    public Student3(String name, String surname, int age, String course, String favoriteCourse) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.favoriteCourse = favoriteCourse;
    }
    public Student3(){

    }

    public String getName() {
        nameCount++;
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere vuoto o nullo");
        }
        if (name != null && name.length() <= 40) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Il cognome non può essere vuoto o nullo");
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("L'età non può essere negativa");
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFavoriteCourse() {
        return favoriteCourse;
    }

    public void setFavoriteCourse(String favoriteCourse) {
        if (favoriteCourse == null || favoriteCourse.trim().isEmpty()) {
            throw new IllegalArgumentException("Il corso preferito non può essere vuoto o nullo");
        }
        this.favoriteCourse = favoriteCourse;
    }

    public int getNameCount() {
        return nameCount;
    }

    public void setNameCount(int nameCount) {
        this.nameCount = nameCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student = (Student3) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(course, student.course) && Objects.equals(favoriteCourse, student.favoriteCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, course, favoriteCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", favoriteCourse='" + favoriteCourse + '\'' +
                '}';
    }
}
