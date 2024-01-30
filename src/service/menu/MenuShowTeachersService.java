package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.inter.MenuShowTeacherServiceInter;

public class MenuShowTeachersService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[]allTeacher= Config.instance().getTeachers();
        for(int i=0; i< allTeacher.length;i++){
            System.out.println(allTeacher[i]);
        }
    }
}
