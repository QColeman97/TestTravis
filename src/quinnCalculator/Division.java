package quinnCalculator;

public class Division implements Operation {

	@Override
	public int operate(int operandOne, int operandTwo) {
		return (operandOne / operandTwo);
	}
}
