package CTDL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayStudent {
    ArrayList<Student> listStudent;
    public ArrayStudent(){
        listStudent = new ArrayList<>();
    }

    public ArrayStudent(ArrayList<Student> list){
        this.listStudent = list;
    }

    public void add(Student st){
        listStudent.add(st);
    }
    public void display(){
        for(Student st : listStudent){
            st.output();
        }
    }
    public double Avg(){
        double avg = 0;
        for(Student st : listStudent){
            avg += st.getMark();
        }
        return avg / listStudent.size();
    }

    public void sortbyMark(){
        Collections.sort(listStudent, new Comparator<Student>() {
            public int compare(Student st1, Student st2) {
                // TODO Auto-generated method stub
                return (int) (st1.getMark() - st2.getMark());
            }
        });
    }


}
