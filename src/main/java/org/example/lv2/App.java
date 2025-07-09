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


            int result = calculator.calculate(a, b, operator);


            System.out.println("결과: " + result);

            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)");
            String command = sc.next();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}