package com.syntax.class22;

public class AdvanceCalc {
    public static void main(String[] args) {
        //printNames("Aladin","Aladin","Aladin");
        int age=10;
        String name;
        if(age>18){
            name="Time to go work";
        }else{
            name="Enjoy no Work";
        }
        System.out.println(name);

        String name2=age>18? "Time to go work ":"Enjoy no Work";
//  String name2=age>18? age>10?"nested in":" it is nested else":"Enjoy no Work";
        System.out.println(name2);
    }
}
