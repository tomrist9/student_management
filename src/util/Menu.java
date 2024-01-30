package util;

import bean.Config;
import service.menu.*;
import service.inter.Process;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentsService()),
    SHOW_ALL_TEACHERS(5, "Show all teachers", new MenuShowTeachersService()),
    SHOW_ALL_STUDENTS(6, "Show all students", new MenuShowStudentService()),
    UNKNOWN;
    private int number;
    private String label;
    private Process service;


    Menu() {
    }

    Menu(int number, String label, Process service) {
        this.label = label;
        this.number = number;
        this.service = service;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "label='" + label + '\'' +
                '}';
    }

    public void process() {

        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;

    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }


    public static void showAllMenu() {
        Menu[] menus = Menu.values();
       for(int i=0; i<menus.length; i++){
            if (menus[i]!= UNKNOWN) {
                if (menus[i]==LOGIN||menus[i]==REGISTER) {
                    if(!Config.isLoggedIn()){
                        System.out.println(menus[i]);
                    }

                } else if (Config.isLoggedIn()) {

                    System.out.println(menus[i]);
                }
            }
        }
    }
}