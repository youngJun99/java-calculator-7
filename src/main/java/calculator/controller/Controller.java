package calculator.controller;

import calculator.service.CalculationService;
import calculator.view.OutputView;

public class Controller {

    private final CalculationService calculationService;
    private final OutputView outputView;

    public Controller(CalculationService calculationService, OutputView outputView) {
        this.calculationService = calculationService;
        this.outputView = outputView;
    }

    public void start() {
        int answer = calculationService.calculate();
        outputView.printResult(answer);
    }
}
