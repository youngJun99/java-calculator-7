package calculator.domain;

import calculator.constants.Errors;

public class Number {

    private final int number;

    public Number(int number) {
        validateNumber(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private void validateNumber(int input) {
        if (input < 1) {
            throw new IllegalArgumentException(Errors.NOT_POSITIVE_NUMBER.getMessage());
        }
    }

}
