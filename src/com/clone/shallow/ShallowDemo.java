package com.clone.shallow;


/*
 * In shallow Clone Reference of student2 points to the same course object.
 */
public class ShallowDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
         * Original
         */
        Course course = new Course("ComputerScience", "DS And Algo", "AI", "Database", "Biology");
        Student student1 = new Student(14, "Avinash", "Patel", course);
        Student student2 = (Student) student1.clone();
        System.out.println(student1);
        System.out.println(":::::::::Maniplating the course items:::::::::::::::::");
        course.setSub1("Maths");
        student1.setCourse(course);
        System.out.println("::::After Manipulating course in student1 :::::");
        System.out.println(student1);


        /*
         * Cloned
         */
        System.out.println("::::::::::::::Details Of Student2:::::::::::");
        
        System.out.println(student2);
    }

}
