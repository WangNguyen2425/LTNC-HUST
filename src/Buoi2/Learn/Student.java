package Buoi2.Learn;

import java.sql.SQLOutput;

public class Student {
     int a = 5;
    public class abc{
        public abc(){
            a = 6;
        }
    }
    public  static void main(String[] args) {
        Student student = new Student();
        Student.abc ab = student.new abc();
        System.out.println(student.a);
    }}
