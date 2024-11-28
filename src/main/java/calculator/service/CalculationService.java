package calculator.service;

import calculator.domain.Numbers;
import calculator.handler.InputHandler;
import calculator.view.OutputView;

import java.util.List;

public class CalculationService {

    private final InputHandler inputHandler;

    public CalculationService(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    public int calculate() {
        List<Integer> inputNumber = inputHandler.getNumber();
        Numbers numbers = new Numbers(inputNumber);
        return numbers.getSum();
    }
}
