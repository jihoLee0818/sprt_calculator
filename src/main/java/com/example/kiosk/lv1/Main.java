package com.example.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[SHAKESHACK MENU] | 메뉴를 번호로 골라주세요");
            System.out.println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. exit           | exit  | 0을 입력시 종료");
            String command = sc.next();


            if (command.equals("0"))
                break;
            else if (command.equals("1")) {
                System.out.println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (command.equals("2")) {
                System.out.println("2. SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (command.equals("3")) {
                System.out.println("3. Cheeseburger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (command.equals("4")) {
                System.out.println("4. Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
            System.out.println();
        }


        System.out.println("프로그램을 종료합니다");
        sc.close();


    }
}
