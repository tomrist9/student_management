package service.menu;

import bean.Config;
import bean.Student;
import service.inter.MenuShowStudentInter;

public class MenuShowStudentService implements MenuShowStudentInter {
    @Override
    public void process() {
        Student []allStudent= Config.instance().getStudents();
        for(int i=0; i< allStudent.length;i++){
            System.out.println(allStudent[i]);
        }
    }
}
