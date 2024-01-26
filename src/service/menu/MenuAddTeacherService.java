package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.inter.MenuAddStudentServiceInter;
import service.inter.MenuAddTeacherInter;

import java.util.Scanner;
import java.util.TreeMap;

public class MenuAddTeacherService implements MenuAddTeacherInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("The teacher has been added.");
    }
}
