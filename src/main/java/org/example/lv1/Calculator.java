package org.example.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String sign = sc.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            int result = 0;


            if (sign.equals("+")) {
                result = a + b;
            } else if (sign.equals("-")) {
                result = a - b;
            } else if (sign.equals("*")) {
                result = a * b;
            } else if (sign.equals("/")) {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = a / b;
            } else {
                System.out.println("잘못된 연산 기호입니다.");
                continue;
            }

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String command = sc.next();

            if (command.equals("exit")) {
                break;
            }
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();


    }
}