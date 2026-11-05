package com.kevin.springioc;

public class Student {
    /* private String studentName;
    private int id; */
    private int id;
    private MathCheat mc;

    /* public Student(int id, String studentName){
        this.id = id;
        this.studentName = studentName;

    } */

    public void setId(int id){
        this.id = id;
    }

    public void setMc(MathCheat mc){
        this.mc = mc;
    }
    /* 
    public Student(MathCheat mc){
        this.mc = mc;
    } */

    public void cheating(){
        mc.mathCheat();
    }

    /* 
    public void  setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setId(int id){
        this.id = id;
    } */
    public void displayStudent(){
        System.out.println("student name is: " + studentName + " and id is: " + id);
    }
}
