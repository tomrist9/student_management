package util;

import service.inter.MenuLoginServiceInter;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class MenuUtil {
 public static Menu showMenu() {
     Menu[] menus = Menu.values();
     for (int i = 0; i < menus.length; i++) {
         System.out.println(menus[i]);
     }
     Scanner sc = new Scanner(System.in);
     System.out.println("Please select from menu");
     int selectedMenu = sc.nextInt();

   return Menu.find(selectedMenu);
     }

    public static void processMenu(Menu menu){
     menu.process();
    }
  public static void processAllLoginObjects(MenuLoginServiceInter[] logins){
     for(int i=0; i< logins.length;i++){
         MenuLoginServiceInter m=logins[i];
         m.foo();
     }
  }
}


