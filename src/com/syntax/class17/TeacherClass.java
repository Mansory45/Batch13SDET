package com.syntax.class17;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Zombie";
        teacher.schoolName= "Syntax";
       // Because printInfo is public we can call it in other classes and because its the part of teacher class
        // the private fields which in turn let us access those fields.
        teacher.printInfo();
    }
}
