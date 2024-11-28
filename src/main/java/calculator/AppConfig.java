package calculator;

import calculator.controller.Controller;
import calculator.handler.InputHandler;
import calculator.service.CalculationService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class AppConfig {

    public Controller controller() {
        return new Controller(
                new CalculationService(new InputHandler(new InputView())),
                new OutputView());
    }
}
