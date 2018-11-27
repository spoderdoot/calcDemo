import calc.CalcFunctions;
import exceptions.UndefinedMathException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UndefinedMathException {
        CalcFunctions calc = new CalcFunctions();

        int num1;
        int num2;
        int result = 0;
        String function;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("What do you want to do?\nThere are following functions:\nadd\nsubtract\nmultiply\ndivide");
        function = scanObject.next();
        System.out.println("Enter your first number:");
        num1 = scanObject.nextInt();
        System.out.println("Enter your second number:");
        num2 = scanObject.nextInt();



       /** if(function.equals("add")){
            result = calc.add(num1,num2);
        } else if(function.equals("subtract")){
            result = calc.subtract(num1,num2);
        } else if(function.equals("multiply")){
            result = calc.multiply(num1,num2);
        } else if(function.equals("divide")){
                result = calc.divide(num1, num2);
        }**/

        switch (function) {
            case "add": result = calc.add(num1,num2); break;
            case "subtract": result = calc.subtract(num1,num2); break;
            case "multiply": result = calc.multiply(num1,num2); break;
            case "divide": result = calc.divide(num1,num2); break;
        }
        System.out.println("The result is "+result);
    }
}
