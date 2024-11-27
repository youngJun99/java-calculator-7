package calculator.constants;

public enum Errors {

    NOT_POSITIVE_NUMBER("입력된 숫자가 양수가 아닙니다.");


    private static final String PREFIX = "[ERROR] ";

    private String message;

    Errors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
