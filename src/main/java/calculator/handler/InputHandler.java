package calculator.handler;

import calculator.constants.Errors;
import calculator.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputHandler {

    private static final String CUSTOM_DELIMITER_REGEX = "^//([^0-9\\s]+)\n";
    private static final String VALIDATION_REGEX = "^\\d+([,:\\1]\\d+)*$";
    private static final String DELIMITER_REGEX = "[,:\\1]";

    private final InputView inputView;
    private String inputString;

    public InputHandler(InputView inputView) {
        this.inputView = inputView;
    }

    public List<Integer> getNumber() {
        inputString = inputView.printStringInputMessage().replace("\\n", "\n");
        String customDelimiter = getCustomDelimiter(inputString);
        return extractNumbers(customDelimiter);
    }

    private String getCustomDelimiter(String input) {
        Pattern pattern = Pattern.compile(CUSTOM_DELIMITER_REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            this.inputString = input.replaceFirst(CUSTOM_DELIMITER_REGEX, "");
            return customDelimiter;
        }
        return "";
    }

    private List<Integer> extractNumbers(String customDelimiter) {
        validateInput(customDelimiter);
        String delimiterRegex = DELIMITER_REGEX.replace("\\1", customDelimiter);
        return Arrays.stream(inputString.split(delimiterRegex))
                .map(Integer::parseInt)
                .toList();
    }

    private void validateInput(String customDelimiter) {
        String regex = VALIDATION_REGEX.replace("\\1", customDelimiter);
        if (!inputString.matches(regex)) {
            throw new IllegalArgumentException(Errors.INPUT_NOT_VALID.getMessage());
        }
    }

}
