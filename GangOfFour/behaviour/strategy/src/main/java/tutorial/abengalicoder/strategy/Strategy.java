package tutorial.abengalicoder.strategy;

public interface Strategy {
	int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy{
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}

class OperationSubstract implements Strategy{
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
class OperationMultiply implements Strategy{
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}