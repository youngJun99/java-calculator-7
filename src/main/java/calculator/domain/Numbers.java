package calculator.domain;

import java.util.List;

public class Numbers {

    private final List<Number> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers.stream()
                .map(Number::new)
                .toList();
    }

    public int getSum() {
        return numbers.stream()
                .mapToInt(Number::getNumber)
                .sum();
    }
}
