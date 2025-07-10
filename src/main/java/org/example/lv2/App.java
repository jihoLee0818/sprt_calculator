package org.example.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            try {
                int result = calculator.calculate(a, b, operator);
                System.out.println("결과: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }

            boolean shouldExitMainLoop = false;
            while (true) {
                System.out.println("\n추가 계산을 원하시면 아무 키나 누르세요. (exit 입력 시 종료, remove 입력 시 가장 오래된 결과 삭제)");

                String command = sc.next();

                if (command.equalsIgnoreCase("exit")) {
                    shouldExitMainLoop = true;
                    break;
                } else if (command.equalsIgnoreCase("remove")) {
                    calculator.removeFirstResult();
                    System.out.println("가장 오래된 결과가 삭제되었습니다.");
                } else {
                    break;
                }
            }
            if (shouldExitMainLoop) {
                break;
            }

        }

        System.out.println("\n--- 모든 계산 결과 ---");
        for (int res : calculator.getResults()) {
            System.out.println(res);
        }
        System.out.println("----------------------");

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}