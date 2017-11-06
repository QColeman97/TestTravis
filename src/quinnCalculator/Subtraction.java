package quinnCalculator;

public class Subtraction implements Operation {

	@Override
	public int operate(int operandOne, int operandTwo) {
		return (operandOne - operandTwo);
	}
}
