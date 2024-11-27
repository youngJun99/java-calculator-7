package calculator.constants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Delimiter {
    COMMA(","),
    SEMI_COLON(":");

    private String delimiter;

    Delimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public List<String> getDelimiters() {
        return Arrays.stream(Delimiter.values())
                .map(Delimiter::getDelimiter)
                .collect(Collectors.toList());
    }

}
