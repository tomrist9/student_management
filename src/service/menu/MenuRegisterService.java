package service.menu;

import service.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void processLogic() {
        System.out.println("register");
    }
}
