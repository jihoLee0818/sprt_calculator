package org.example.lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {
    private List<T> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public T calculate(T a, T b, OperatorType operatorType) {
        double doubleA = a.doubleValue();
        double doubleB = b.doubleValue();
        double result;

        result = switch (operatorType) {
            case PLUS -> doubleA + doubleB;
            case MINUS -> doubleA - doubleB;
            case MULTIPLY -> doubleA * doubleB;
            case DIVIDE -> {
                if (doubleB == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
                yield doubleA / doubleB;
            }
        };

        T typedResult;

        if (a instanceof Integer) {
            typedResult = (T) Integer.valueOf((int) result);
        } else if (a instanceof Double) {
            typedResult = (T) Double.valueOf(result);
        } else {
            throw new IllegalArgumentException("지원하지 않는 숫자 타입입니다.");
        }

        this.results.add(typedResult);

        return typedResult;
    }

    public List<T> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(List<T> results) {
        this.results = new ArrayList<>(results);
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
