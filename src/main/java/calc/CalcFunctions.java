package calc;

import exceptions.UndefinedMathException;

public class CalcFunctions {


    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) throws UndefinedMathException {
        int result;
        if(y == 0) {
            throw new UndefinedMathException("y darf nicht 0 sein!");
        } else {
        result = x / y;
       }
        return result;
    }

}
