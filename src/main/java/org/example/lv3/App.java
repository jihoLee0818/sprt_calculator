package org.example.lv3;

import org.example.lv3.Calculator;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator Calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double a = sc.nextDouble();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operatorSymbol = sc.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            double b = sc.nextDouble();

            try {
                OperatorType operatorType;
                switch (operatorSymbol) {
                    case "+":
                        operatorType = OperatorType.PLUS;
                        break;
                    case "-":
                        operatorType = OperatorType.MINUS;
                        break;
                    case "*":
                        operatorType = OperatorType.MULTIPLY;
                        break;
                    case "/":
                        operatorType = OperatorType.DIVIDE;
                        break;
                        default:
                            throw new IllegalArgumentException("잘못된 연산 기호입니다.");
                }
                double result = Calculator.calculate(a, b, operatorType);
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
                    Calculator.removeFirstResult();
                    System.out.println("가장 오래된 결과가 삭제되었습니다.");
                } else if (command.equalsIgnoreCase("inquiry")){
                    System.out.println("기준 값을 입력하세요.");
                    double criteria = sc.nextDouble();
                    List<Double> inquiryResults = Calculator.inquiryGreaterThan(criteria);
                    System.out.println("--- 조회 결과 ---");
                    for (double res : inquiryResults) {
                        System.out.println(res);
                    }
                } else {
                    break;
                }
            }
            if (shouldExitMainLoop) {
                break;
            }

        }

        System.out.println("\n--- 모든 계산 결과 ---");
        for (double res : Calculator.getResults()) {
            System.out.println(res);
        }
        System.out.println("----------------------");

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}