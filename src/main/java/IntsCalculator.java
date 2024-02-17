public class IntsCalculator implements Ints {
    private final Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }
    @Override
    public double sum(double a, double b) {
        return calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public double mult(double a, double b) {
        return calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public double pow(double a, double b) {
        return calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
