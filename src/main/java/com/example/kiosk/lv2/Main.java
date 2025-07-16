package com.example.kiosk.lv2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴를 번호로 골라주세요");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. exit      | exit  | 0을 입력시 종료");
            String command = sc.next();
            if (command.equals("0")) {
                break;
            } else if (command.equals("1")) {
                MenuItem selectedItem = menuItems.get(0);
                System.out.println("선택한 메뉴 : " + selectedItem.getName() + " | W " + selectedItem.getPrice());
            } else if (command.equals("2")) {
                MenuItem selectedItem = menuItems.get(1);
                System.out.println("선택한 메뉴 : " + selectedItem.getName() + " | W " + selectedItem.getPrice());
            } else if (command.equals("3")) {
                MenuItem selectedItem = menuItems.get(2);
                System.out.println("선택한 메뉴 : " + selectedItem.getName() + " | W " + selectedItem.getPrice());
            } else if (command.equals("4")) {
                MenuItem selectedItem = menuItems.get(3);
                System.out.println("선택한 메뉴 : " + selectedItem.getName() + " | W " + selectedItem.getPrice());
            } else {
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");
            }
            System.out.println();


        }
    }


}


