package quinnCalculator;

public class Addition implements Operation {
	
	@Override
	public int operate(int operandOne, int operandTwo) {
		return (operandOne + operandTwo);
	}
}