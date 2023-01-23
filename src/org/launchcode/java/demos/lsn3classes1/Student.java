package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

//    public Student(String name, int studentId, int numberOfCredits, double gpa) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = numberOfCredits;
//        this.gpa = gpa;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel(int credits){
        if (credits <= 29){
            return "Freshman";
        } else if(credits <= 59){
            return "Sophomore";
        } else if (credits <= 89){
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int credit, double grade){
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += grade * credit;
        this.numberOfCredits += credit;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }
}