package quinnCalculator;

public class OperationFactory {
	
	// use getOp method to get object of type Operation
	public Operation getOp(String opType) {
		if (opType == null) {
			return null;
		}
		
		if (opType.equalsIgnoreCase("ADD")) {
			return new Addition();
		} else if (opType.equalsIgnoreCase("SUB")) {
			return new Subtraction();
		} else if (opType.equalsIgnoreCase("MULT")) {
			return new Multiplication();
		} else if (opType.equalsIgnoreCase("DIV")) {
			return new Division();
		}

		return null;
	}
}
