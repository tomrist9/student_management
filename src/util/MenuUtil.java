package util;

import service.inter.MenuLoginServiceInter;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class MenuUtil {
 public static void showMenu() {
     System.out.println("Please select from the menu:");
     Menu.showAllMenu();

     Scanner sc = new Scanner(System.in);

     int selectedMenuNumber = sc.nextInt();

   Menu selectedMenu=Menu.find(selectedMenuNumber);
      selectedMenu.process();
     }

    public static void processMenu(Menu menu){
     menu.process();
    }

}


