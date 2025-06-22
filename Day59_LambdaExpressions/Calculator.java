
public class Calculator {

    public int calculate(int a, int b, MyMathOperation operation) {
        return operation.operate(a, b);
    }
}
