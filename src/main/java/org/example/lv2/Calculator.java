package org.example.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int a, int b, String operator) {
        int result;

        result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        };

        this.results.add(result);
        return result;
    }
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(List<Integer> results) {
        this.results = new ArrayList<>(results);
    }

    public void removeFirstResult() {
        if(!results.isEmpty()) {
            results.remove(0);
        }
    }
}
