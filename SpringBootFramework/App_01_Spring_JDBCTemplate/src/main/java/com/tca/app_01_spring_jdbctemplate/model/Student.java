package com.tca.app_01_spring_jdbctemplate.model;



public class Student {

    private int studentRno;
    private String studentName;
    private Double studentPer;
    private String studentCity;


    public Student() {}

    public Student(int studentRno, String studentName, Double studentPer, String studentCity) {
        this.studentRno = studentRno;
        this.studentName = studentName;
        this.studentPer = studentPer;
        this.studentCity = studentCity;
    }

    public int getStudentRno() {
        return studentRno;
    }

    public void setStudentRno(int studentRno) {
        this.studentRno = studentRno;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getStudentPer() {
        return studentPer;
    }

    public void setStudentPer(Double studentPer) {
        this.studentPer = studentPer;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }


    @Override
    public String toString() {
        return "Student [studentRno=" + studentRno + ", studentName=" + studentName + ", studentPer=" + studentPer+ ", studentCity=" + studentCity + "]";
    }


}


