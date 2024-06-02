import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CTDL.ArrayStudent;
import CTDL.Student;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayStudent listStudent = new ArrayStudent(new ArrayList<>());
        boolean Check = true;
        while (Check) {
        
            Student newStudent = new Student();
            newStudent.input();
            listStudent.add(newStudent);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ban co muon tiep tuc");
            int kq = scanner.nextInt();
            if(kq == 1){
                Check = true;
            }
            else{
                Check = false;
            }
        }
        listStudent.display();
        listStudent.sortbyMark();
        System.out.println("SInh vien sau khi sap xep");
        listStudent.display();



    }
}
