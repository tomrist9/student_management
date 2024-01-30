package service.menu;

import service.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void foo() {

    }

    @Override
    public void processLogic() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your username");
        String username =sc.nextLine();

        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter your password");
        String password =sc2.nextLine();

        if (!(username.equals("user"))&& password.equals("11111")){
            throw new IllegalArgumentException("Username or password is invalid");
        }
    }
}
