package calculator.service;

import calculator.domain.Numbers;
import calculator.handler.InputHandler;
import calculator.view.OutputView;

import java.util.List;

public class CalculationService {

    private final InputHandler inputHandler;
    private final OutputView outputView;

    public CalculationService(InputHandler inputHandler, OutputView outputView) {
        this.inputHandler = inputHandler;
        this.outputView = outputView;
    }

    public int calculate() {
        List<Integer> inputNumber = inputHandler.getNumber();
        Numbers numbers = new Numbers(inputNumber);
        return numbers.getSum();
    }
}
