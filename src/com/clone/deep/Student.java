package com.clone.deep;

/*
 * Student class contain course
 */
public class Student implements Cloneable {

    private int studentId;
    private String firstName;
    private String lasteName;
    private Course course;

    public Student(int studentId, String firstName, String lasteName, Course course) {
        super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lasteName="
                        + lasteName + ", course=" + course + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }


}
