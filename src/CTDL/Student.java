package CTDL;

import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private String name;
    private double mark;
    public String getName() {
        return name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter mark");
        mark = sc.nextDouble();
    }
    public void output(){
        System.out.println("name" + this.name + "mark" + this.mark);
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }


    

}
