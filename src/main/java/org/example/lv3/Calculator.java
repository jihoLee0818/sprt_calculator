package org.example.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    private List<Double> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public double calculate(double a, double b, OperatorType operatorType) {
        double result;

        result = switch (operatorType) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
                yield a / b;
            }
        };
        this.results.add(result);
        return result;

    }

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public List<Double> inquiryGreaterThan(double number) {
        return results.stream().filter(result -> result > number).collect(Collectors.toList());
    }


    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
