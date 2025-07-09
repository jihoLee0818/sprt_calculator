package org.example.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int a, int b, String operator) {
        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = a / b;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다.");
                return 0;
        }

        this.results.add(result);
        return result;
    }
}
