package calculator.constants;

public enum Errors {

    NOT_POSITIVE_NUMBER("입력된 숫자가 양수가 아닙니다."),
    INPUT_NOT_VALID("올바른 형태로 입력되지 않았습니다.");


    private static final String PREFIX = "[ERROR] ";

    private String message;

    Errors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
