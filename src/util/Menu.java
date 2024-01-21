package util;

import service.MenuLogin;
import service.menu.MenuRegisterService;
import service.inter.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLogin()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher"),
    ADD_STUDENT(4, "Add student"),
    SHOW_ALL_TEACHERS(5, "Show all teachers"),
    SHOW_ALL_STUDENTS(6, "Show all students"),
    UNKNOWN;
    private String label;
    private MenuService service;
    private int number;

    Menu() {
    }

    Menu(int number, String label, MenuService service) {
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
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);
        }
    }

}
